import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class TicTacToe extends JFrame implements ActionListener {

	private JPanel contentPane;

	JButton btnNewButton = new JButton("");
	JButton button = new JButton("");
	JButton button_1 = new JButton("");
	JButton button_2 = new JButton("");
	JButton button_3 = new JButton("");
	JButton button_4 = new JButton("");
	JButton button_5 = new JButton("");
	JButton button_6 = new JButton("");
	JButton button_7 = new JButton("");
	JButton btnReset = new JButton("RESET");
	Border emptyBorder = BorderFactory.createEmptyBorder();
	static boolean playRed = true, pl1Win = false, pl2Win = false;
	static int active[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	static String image[] = new String[9];
	static String path[] = { "E:\\PSD\\JAVA\\SE\\TicTacToe\\11.png", "E:\\PSD\\JAVA\\SE\\TicTacToe\\12.png",
			"E:\\PSD\\JAVA\\SE\\TicTacToe\\13.png" };
	private final JLabel lblPlayer = new JLabel("Player 1");
	private final JLabel label = new JLabel("");
	private final JLabel label_1 = new JLabel("");
	private final JLabel lblPlayer_1 = new JLabel("Player 2");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					for (int i = 0; i < 9; i++) {
						image[i] = path[0];
					}
					TicTacToe frame = new TicTacToe();
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
	public TicTacToe() {

		super("TicTacToe");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		

		btnNewButton.setIcon(new ImageIcon(image[0]));
		btnNewButton.setBounds(10, 11, 120, 120);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		btnNewButton.setBorder(emptyBorder);

		button.setIcon(new ImageIcon(image[1]));
		button.setBounds(158, 11, 120, 120);
		button.addActionListener(this);
		contentPane.add(button);
		button.setBorder(emptyBorder);

		button_1.setIcon(new ImageIcon(image[2]));
		button_1.setBounds(304, 11, 120, 120);
		button_1.addActionListener(this);
		contentPane.add(button_1);
		button_1.setBorder(emptyBorder);

		button_2.setIcon(new ImageIcon(image[3]));
		button_2.setBounds(10, 146, 120, 120);
		button_2.addActionListener(this);
		contentPane.add(button_2);
		button_2.setBorder(emptyBorder);

		button_3.setIcon(new ImageIcon(image[4]));
		button_3.setBounds(158, 146, 120, 120);
		button_3.addActionListener(this);
		contentPane.add(button_3);
		button_3.setBorder(emptyBorder);

		button_4.setIcon(new ImageIcon(image[5]));
		button_4.setBounds(304, 146, 120, 120);
		button_4.addActionListener(this);
		contentPane.add(button_4);
		button_4.setBorder(emptyBorder);

		button_5.setIcon(new ImageIcon(image[6]));
		button_5.setBounds(10, 280, 120, 120);
		button_5.addActionListener(this);
		contentPane.add(button_5);
		button_5.setBorder(emptyBorder);

		button_6.setIcon(new ImageIcon(image[7]));
		button_6.setBounds(158, 280, 120, 120);
		button_6.addActionListener(this);
		contentPane.add(button_6);
		button_6.setBorder(emptyBorder);

		button_7.setIcon(new ImageIcon(image[8]));
		button_7.setBounds(304, 280, 120, 120);
		button_7.addActionListener(this);
		contentPane.add(button_7);
		button_7.setBorder(emptyBorder);
		btnReset.setBackground(Color.WHITE);

		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(10, 468, 414, 32);
		btnReset.addActionListener(this);
		contentPane.add(btnReset);
		
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlayer.setBounds(133, 425, 73, 26);
		contentPane.add(lblPlayer);
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("E:\\PSD\\JAVA\\SE\\TicTacToe\\12t.png"));
		label.setBounds(101, 425, 27, 26);
		contentPane.add(label);
		
		label_1.setIcon(new ImageIcon("E:\\PSD\\JAVA\\SE\\TicTacToe\\13t.png"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(237, 425, 27, 26);
		contentPane.add(label_1);
		
		lblPlayer_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlayer_1.setBounds(269, 425, 73, 26);
		contentPane.add(lblPlayer_1);

	}

	static void checkWin() {
		if (active[0] == 2 && active[1] == 2 && active[2] == 2 || active[0] == 2 && active[3] == 2 && active[6] == 2
				|| active[0] == 2 && active[4] == 2 && active[8] == 2
				|| active[1] == 2 && active[4] == 2 && active[7] == 2
				|| active[2] == 2 && active[5] == 2 && active[8] == 2
				|| active[3] == 2 && active[4] == 2 && active[5] == 2
				|| active[6] == 2 && active[7] == 2 && active[8] == 2
				|| active[6] == 2 && active[4] == 2 && active[2] == 2) {
			JOptionPane.showMessageDialog(null, "Player One Won!", "Congrats!!!", JOptionPane.INFORMATION_MESSAGE);
			for (int i = 0; i < 9; i++) {
				active[i] = 4;
			}
			playRed = true;
		}
		
		if (active[0] == 3 && active[1] == 3 && active[2] == 3 || active[0] == 3 && active[3] == 3 && active[6] == 3
				|| active[0] == 3 && active[4] == 3 && active[8] == 3
				|| active[1] == 3 && active[4] == 3 && active[7] == 3
				|| active[2] == 3 && active[5] == 3 && active[8] == 3
				|| active[3] == 3 && active[4] == 3 && active[5] == 3
				|| active[6] == 3 && active[7] == 3 && active[8] == 3
				|| active[6] == 3 && active[4] == 3 && active[2] == 3) {
			JOptionPane.showMessageDialog(null, "Player Two Won!", "Congrats!!!", JOptionPane.INFORMATION_MESSAGE);
			for (int i = 0; i < 9; i++) {
				active[i] = 4;
			}
			playRed = true;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnNewButton && active[0] == 1) {
			if (playRed == true) {
				image[0] = path[1];
				playRed = false;
				active[0] = 2;
			} else {
				image[0] = path[2];
				playRed = true;
				active[0] = 3;
			}
			btnNewButton.setIcon(new ImageIcon(image[0]));
			checkWin();
		}
		if (e.getSource() == button && active[1] == 1) {
			if (playRed == true) {
				image[1] = path[1];
				playRed = false;
				active[1] = 2;
			} else {
				image[1] = path[2];
				playRed = true;
				active[1] = 3;
			}

			button.setIcon(new ImageIcon(image[1]));
			checkWin();
		}
		if (e.getSource() == button_1 && active[2] == 1) {
			if (playRed == true) {
				image[2] = path[1];
				playRed = false;
				active[2] = 2;
			} else {
				image[2] = path[2];
				playRed = true;
				active[2] = 3;
			}

			button_1.setIcon(new ImageIcon(image[2]));
			checkWin();
		}
		if (e.getSource() == button_2 && active[3] == 1) {
			if (playRed == true) {
				image[3] = path[1];
				playRed = false;
				active[3] = 2;
			} else {
				image[3] = path[2];
				playRed = true;
				active[3] = 3;
			}

			button_2.setIcon(new ImageIcon(image[3]));
			checkWin();
		}
		if (e.getSource() == button_3 && active[4] == 1) {
			if (playRed == true) {
				image[4] = path[1];
				playRed = false;
				active[4] = 2;
			} else {
				image[4] = path[2];
				playRed = true;
				active[4] = 3;
			}

			button_3.setIcon(new ImageIcon(image[4]));
			checkWin();
		}
		if (e.getSource() == button_4 && active[5] == 1) {
			if (playRed == true) {
				image[5] = path[1];
				playRed = false;
				active[5] = 2;
			} else {
				image[5] = path[2];
				playRed = true;
				active[5] = 3;
			}

			button_4.setIcon(new ImageIcon(image[5]));
			checkWin();
		}
		if (e.getSource() == button_5 && active[6] == 1) {
			if (playRed == true) {
				image[6] = path[1];
				playRed = false;
				active[6] = 2;
			} else {
				image[6] = path[2];
				playRed = true;
				active[6] = 3;
			}

			button_5.setIcon(new ImageIcon(image[6]));
			checkWin();
		}
		if (e.getSource() == button_6 && active[7] == 1) {
			if (playRed == true) {
				image[7] = path[1];
				playRed = false;
				active[7] = 2;
			} else {
				image[7] = path[2];
				playRed = true;
				active[7] = 3;
			}

			button_6.setIcon(new ImageIcon(image[7]));
			checkWin();
		}
		if (e.getSource() == button_7 && active[8] == 1) {
			if (playRed == true) {
				image[8] = path[1];
				playRed = false;
				active[8] = 2;
			} else {
				image[8] = path[2];
				playRed = true;
				active[8] = 3;
			}

			button_7.setIcon(new ImageIcon(image[8]));
			checkWin();
		}
		if (e.getSource() == btnReset) {
			for (int i = 0; i < 9; i++) {
				image[i] = path[0];
				active[i] = 1;
			}
			btnNewButton.setIcon(new ImageIcon(image[0]));
			button.setIcon(new ImageIcon(image[1]));
			button_1.setIcon(new ImageIcon(image[2]));
			button_2.setIcon(new ImageIcon(image[3]));
			button_3.setIcon(new ImageIcon(image[4]));
			button_4.setIcon(new ImageIcon(image[5]));
			button_5.setIcon(new ImageIcon(image[6]));
			button_6.setIcon(new ImageIcon(image[7]));
			button_7.setIcon(new ImageIcon(image[8]));
		}

	}
}
