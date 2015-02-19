package me.heraclitus.compiler.frontend;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window.Type;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainWindow {

	JFrame frame;
	JButton inputBtn, outputBtn;
	JLabel inputLbl, outputLbl;
	JFileChooser inputCh, outputCh;
	File inputFile, outputFile;
	JButton compileBtn;
	JScrollPane outputPane;
	JTextArea outputTA;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainWindow() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		initializeWindow();
	}

	/**
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws UnsupportedLookAndFeelException
	 */
	private void initializeWindow() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setType(Type.NORMAL);
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 123 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 68, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		inputLbl = new JLabel("Input: ");
		GridBagConstraints inputLblGBC = new GridBagConstraints();
		inputLblGBC.insets = new Insets(5, 5, 5, 5);
		inputLblGBC.anchor = GridBagConstraints.LINE_START;
		inputLblGBC.gridx = 0;
		inputLblGBC.gridy = 1;
		frame.getContentPane().add(inputLbl, inputLblGBC);

		inputBtn = new JButton("Change");
		GridBagConstraints inputBtnGBC = new GridBagConstraints();
		inputBtnGBC.insets = new Insets(5, 5, 5, 5);
		inputBtnGBC.gridx = 1;
		inputBtnGBC.gridy = 1;
		frame.getContentPane().add(inputBtn, inputBtnGBC);

		compileBtn = new JButton("Compile");
		GridBagConstraints compileBtnGBC = new GridBagConstraints();
		compileBtnGBC.insets = new Insets(5, 5, 5, 5);
		compileBtnGBC.gridx = 1;
		compileBtnGBC.gridy = 2;
		compileBtnGBC.fill = GridBagConstraints.NONE;
		compileBtnGBC.anchor = GridBagConstraints.CENTER;
		frame.getContentPane().add(compileBtn, compileBtnGBC);

		outputLbl = new JLabel("Output: ");
		GridBagConstraints outputLblGBC = new GridBagConstraints();
		outputLblGBC.insets = new Insets(5, 5, 5, 5);
		outputLblGBC.anchor = GridBagConstraints.LINE_START;
		outputLblGBC.gridx = 0;
		outputLblGBC.gridy = 3;
		frame.getContentPane().add(outputLbl, outputLblGBC);

		outputBtn = new JButton("Change");
		GridBagConstraints outputBtnGBC = new GridBagConstraints();
		outputBtnGBC.insets = new Insets(5, 5, 5, 5);
		outputBtnGBC.gridx = 1;
		outputBtnGBC.gridy = 3;
		frame.getContentPane().add(outputBtn, outputBtnGBC);
		
		outputPane = new JScrollPane();
		GridBagConstraints outputPaneGBC = new GridBagConstraints();
		outputPaneGBC.gridwidth = 2;
		outputPaneGBC.insets = new Insets(5, 5, 5, 5);
		outputPaneGBC.fill = GridBagConstraints.BOTH;
		outputPaneGBC.gridx = 0;
		outputPaneGBC.gridy = 4;
		frame.getContentPane().add(outputPane, outputPaneGBC);
		
		outputTA = new JTextArea(10, 79);
		outputTA.setEditable(false);
		outputPane.setViewportView(outputTA);

		frame.pack();
	}
}
