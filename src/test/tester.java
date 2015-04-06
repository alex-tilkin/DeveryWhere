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
import javax.swing.JCheckBox;

public class tester {

	private JFrame frame;
	SttController sttController = null; 
	private JTextField textField;
	private JLabel thresholdValue;
	private JLabel lblNewLabel;
	private JSlider slider;
	private JCheckBox chckbxAutoRecording;
	private JButton btnRecord;
	
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
					sttController.setConfidenceThreshold(0);
					sttController.setDebugMode(true);
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
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnRecord = new JButton("Record");
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnRecord.getText().equals("Record")) {
					btnRecord.setText("Stop");
					sttController.begin();
				}
				else {
					btnRecord.setText("Record");
					sttController.end();
				}
			}
		});
		
		btnRecord.setBounds(10, 42, 89, 23);
		frame.getContentPane().add(btnRecord);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 11, 414, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Threshold");
		lblNewLabel.setBounds(10, 76, 89, 23);
		frame.getContentPane().add(lblNewLabel);
		
		thresholdValue = new JLabel("0%");
		thresholdValue.setBounds(198, 76, 32, 23);
		frame.getContentPane().add(thresholdValue);
		
		slider = new JSlider();
		slider.setValue(0);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				sttController.setConfidenceThreshold(slider.getValue());
				thresholdValue.setText(String.valueOf(slider.getValue()) + "%");
			}
		});

		slider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {

			}
		});
		slider.setBounds(71, 76, 117, 23);
		frame.getContentPane().add(slider);
		
		chckbxAutoRecording = new JCheckBox("Auto Recording");
		chckbxAutoRecording.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					sttController.setAutoRecord(chckbxAutoRecording.isSelected());
					btnRecord.setEnabled(!btnRecord.isEnabled());
			}
		});
		chckbxAutoRecording.setBounds(10, 112, 131, 23);
		frame.getContentPane().add(chckbxAutoRecording);
	}
}