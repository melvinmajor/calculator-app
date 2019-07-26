package calculatorApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.JProgressBar;

public class MainGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonCalculator = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public MainGui() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{63, 63, 63, 43, 0};
		gbl_contentPane.rowHeights = new int[]{55, 45, 45, 45, 45, 45, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(64, 64, 64)));
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 23));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(15);
		
		JButton button_2 = new JButton("C");
		buttonCalculator.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		JButton button_1 = new JButton("<--");
		buttonCalculator.add(button_1);
		button_1.setPreferredSize(new Dimension(39, 23));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 1;
		contentPane.add(button_1, gbc_button_1);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 1;
		contentPane.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("+");
		buttonCalculator.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 0);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 1;
		contentPane.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("1");
		buttonCalculator.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 2;
		contentPane.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("2");
		buttonCalculator.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 1;
		gbc_button_5.gridy = 2;
		contentPane.add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("3");
		buttonCalculator.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 2;
		gbc_button_6.gridy = 2;
		contentPane.add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("-");
		buttonCalculator.add(button_7);
		button_7.setPreferredSize(new Dimension(39, 23));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 0);
		gbc_button_7.gridx = 3;
		gbc_button_7.gridy = 2;
		contentPane.add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("4");
		buttonCalculator.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 0;
		gbc_button_8.gridy = 3;
		contentPane.add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("5");
		buttonCalculator.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 1;
		gbc_button_9.gridy = 3;
		contentPane.add(button_9, gbc_button_9);
		
		JButton button_10 = new JButton("6");
		buttonCalculator.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.BOTH;
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 2;
		gbc_button_10.gridy = 3;
		contentPane.add(button_10, gbc_button_10);
		
		JButton button_11 = new JButton("*");
		buttonCalculator.add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 5, 0);
		gbc_button_11.gridx = 3;
		gbc_button_11.gridy = 3;
		contentPane.add(button_11, gbc_button_11);
		
		JButton button_12 = new JButton("7");
		buttonCalculator.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.BOTH;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 0;
		gbc_button_12.gridy = 4;
		contentPane.add(button_12, gbc_button_12);
		
		JButton button_13 = new JButton("8");
		buttonCalculator.add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.BOTH;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 1;
		gbc_button_13.gridy = 4;
		contentPane.add(button_13, gbc_button_13);
		
		JButton button_14 = new JButton("9");
		buttonCalculator.add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.BOTH;
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 2;
		gbc_button_14.gridy = 4;
		contentPane.add(button_14, gbc_button_14);
		
		JButton button_15 = new JButton("/");
		buttonCalculator.add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.fill = GridBagConstraints.BOTH;
		gbc_button_15.insets = new Insets(0, 0, 5, 0);
		gbc_button_15.gridx = 3;
		gbc_button_15.gridy = 4;
		contentPane.add(button_15, gbc_button_15);
		
		JButton button_16 = new JButton(".");
		buttonCalculator.add(button_16);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.fill = GridBagConstraints.BOTH;
		gbc_button_16.insets = new Insets(0, 0, 0, 5);
		gbc_button_16.gridx = 0;
		gbc_button_16.gridy = 5;
		contentPane.add(button_16, gbc_button_16);
		
		JButton button_17 = new JButton("0");
		buttonCalculator.add(button_17);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.fill = GridBagConstraints.BOTH;
		gbc_button_17.insets = new Insets(0, 0, 0, 5);
		gbc_button_17.gridx = 1;
		gbc_button_17.gridy = 5;
		contentPane.add(button_17, gbc_button_17);
		
		JButton button_18 = new JButton("=");
		buttonCalculator.add(button_18);
		button_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.gridwidth = 2;
		gbc_button_18.fill = GridBagConstraints.BOTH;
		gbc_button_18.gridx = 2;
		gbc_button_18.gridy = 5;
		contentPane.add(button_18, gbc_button_18);
	}
}
