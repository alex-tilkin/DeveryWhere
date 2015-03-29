package test;

import java.awt.EventQueue;

import javax.swing.JFrame;

import speechToText.SttController;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;

public class tester {

	private JFrame frame;
	SttController sttController = null; 
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tester window = new tester();
					window.frame.setVisible(true);
					SttController sttController = window.sttController = new SttController();
					sttController.setup(window);
					sttController.setConfidenceThreshold(80);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tester() {
		initialize();
	}

	public void transcriptionResult(String result) {
		textField.setText(result);
	}
	JLabel thresholdValue;
	JLabel lblNewLabel;
	private JSlider slider;
	private JPanel panel;
	private JLabel lblAutoRecord;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JButton btnNewButton = new JButton("Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton.getText().equals("Record")) {
					btnNewButton.setText("Stop");
					sttController.begin();
				}
				else {
					btnNewButton.setText("Record");
					sttController.end();
				}
			}
		});
		
		btnNewButton.setBounds(10, 42, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 11, 414, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Threshold");
		lblNewLabel.setBounds(10, 76, 89, 23);
		frame.getContentPane().add(lblNewLabel);
		
		thresholdValue = new JLabel("0");
		thresholdValue.setBounds(198, 76, 32, 23);
		frame.getContentPane().add(thresholdValue);
		
		slider = new JSlider();
		slider.setValue(0);
		slider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				sttController.setConfidenceThreshold(slider.getValue());
				thresholdValue.setText(String.valueOf(slider.getValue()));
			}
		});
		slider.setBounds(71, 76, 117, 23);
		frame.getContentPane().add(slider);
		
		panel = new JPanel();
		panel.setBounds(10, 110, 164, 33);
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		lblAutoRecord = new JLabel("Auto Record:");
		panel.add(lblAutoRecord);
		
		rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton.setSelected(true);
				sttController.setAutoRecord(false);
			}
		});
		panel.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Off");
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(true);
				sttController.setAutoRecord(true);
			}
		});
		rdbtnNewRadioButton_1.setSelected(true);
		panel.add(rdbtnNewRadioButton_1);
	}
}
