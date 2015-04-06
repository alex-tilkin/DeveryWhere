package test;

import java.awt.EventQueue;
import javax.swing.JFrame;
import speechToText.SttController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	private JCheckBox chckbxDebugging;
	
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
		frame.setBounds(100, 100, 496, 300);
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
		textField.setBounds(10, 11, 480, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		thresholdValue = new JLabel("0%");
		thresholdValue.setBounds(210, 76, 32, 23);
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
		slider.setBounds(81, 76, 117, 23);
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
		
		JLabel lblThreshold = new JLabel("Threshold");
		lblThreshold.setBounds(10, 79, 83, 16);
		frame.getContentPane().add(lblThreshold);
		
		chckbxDebugging = new JCheckBox("Debugging");
		chckbxDebugging.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sttController.setDebugMode(chckbxDebugging.isSelected());
			}
		});
		chckbxDebugging.setBounds(10, 147, 128, 23);
		frame.getContentPane().add(chckbxDebugging);
	}
}