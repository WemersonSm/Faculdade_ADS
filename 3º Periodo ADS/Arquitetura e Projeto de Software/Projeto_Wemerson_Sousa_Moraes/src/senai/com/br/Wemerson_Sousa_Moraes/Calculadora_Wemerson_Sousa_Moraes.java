package senai.com.br.Wemerson_Sousa_Moraes;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class Calculadora_Wemerson_Sousa_Moraes {
	String saida[] = new String[4];
	Calculadora calc = new Calculadora();

	private JFrame frmCalculadora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_Wemerson_Sousa_Moraes window = new Calculadora_Wemerson_Sousa_Moraes();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora_Wemerson_Sousa_Moraes() {
		initialize();
		saida[0] = "";
		saida[1] = "";
		saida[2] = "";
		saida[3] = "";
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Calculadora_Wemerson_Sousa_Moraes.class.getResource("/img/calcIcon.png")));
		frmCalculadora.setResizable(false);
		frmCalculadora.setTitle("CALCULADORA");
		frmCalculadora.setBounds(100, 100, 311, 346);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setForeground(Color.DARK_GRAY);
		textArea.setFont(new Font("Courier New", Font.BOLD, 18));
		textArea.setBounds(12, 11, 270, 32);
		frmCalculadora.getContentPane().add(textArea);

		JButton n1 = new JButton("1");
		n1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n1.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n1.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n1.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n1.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n1.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n1.setBounds(10, 90, 50, 40);
		frmCalculadora.getContentPane().add(n1);
		n1.setText(n1.getLabel());

		JButton n2 = new JButton("2");
		n2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n2.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n2.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n2.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n2.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n2.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n2.setBounds(80, 90, 50, 40);
		frmCalculadora.getContentPane().add(n2);
		n2.setText(n2.getLabel());

		JButton n3 = new JButton("3");
		n3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n3.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n3.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n3.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n3.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n3.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n3.setBounds(150, 90, 50, 40);
		frmCalculadora.getContentPane().add(n3);
		n3.setText(n3.getLabel());

		JButton n4 = new JButton("4");
		n4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n4.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n4.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n4.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n4.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n4.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n4.setBounds(10, 143, 50, 40);
		frmCalculadora.getContentPane().add(n4);
		n4.setText(n4.getLabel());

		JButton n5 = new JButton("5");
		n5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n5.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n5.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n5.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n5.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n5.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n5.setBounds(80, 143, 50, 40);
		frmCalculadora.getContentPane().add(n5);
		n5.setText(n5.getLabel());

		JButton n6 = new JButton("6");
		n6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n6.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n6.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n6.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n6.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n6.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n6.setBounds(150, 143, 50, 40);
		frmCalculadora.getContentPane().add(n6);

		JButton n7 = new JButton("7");
		n7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n7.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n7.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n7.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n7.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n7.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n7.setBounds(10, 199, 50, 40);
		frmCalculadora.getContentPane().add(n7);

		JButton n8 = new JButton("8");
		n8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n8.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n8.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n8.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n8.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n8.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n8.setBounds(80, 199, 50, 40);
		frmCalculadora.getContentPane().add(n8);

		JButton n9 = new JButton("9");
		n9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n9.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n9.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n9.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n9.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n9.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n9.setBounds(150, 199, 50, 40);
		frmCalculadora.getContentPane().add(n9);

		JButton n0 = new JButton("0");
		n0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		n0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[1] == "") {
					if (saida[0] == "") {
						saida[0] = n0.getText();
						textArea.setText(saida[0]);
					} else if (saida[0] != "") {
						if (saida[3] != "") {
							saida[0] = n0.getText();
							textArea.setText(saida[0]);
							saida[3] = "";
						} else {
							saida[0] = Integer.toString(
									(int) (Float.parseFloat(saida[0]) * 10 + (Float.parseFloat(n0.getText()))));
							textArea.setText(saida[0]);
						}
					}
				} else {
					if (saida[2] == "") {
						saida[2] = n0.getText();
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					} else if (saida[2] != "") {
						saida[2] = Integer
								.toString((int) (Float.parseFloat(saida[2]) * 10 + (Float.parseFloat(n0.getText()))));
						textArea.setText(saida[0] + " " + saida[1] + " " + saida[2]);
					}
				}
			}
		});
		n0.setBounds(10, 250, 120, 40);
		frmCalculadora.getContentPane().add(n0);

		JButton mult = new JButton("*");
		mult.setFont(new Font("Times New Roman", Font.BOLD, 26));
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[0] == "") {
					textArea.setText("");
				} else {
					saida[1] = mult.getText();
					textArea.setText(saida[0] + " " + saida[1]);
				}
			}
		});
		mult.setBounds(232, 143, 50, 40);
		frmCalculadora.getContentPane().add(mult);
		mult.setText("x");

		JButton div = new JButton("/");
		div.setFont(new Font("Times New Roman", Font.BOLD, 26));
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[0] == "") {
					textArea.setText("");
				} else {
					saida[1] = div.getText();
					textArea.setText(saida[0] + " " + saida[1]);
				}
			}
		});
		div.setBounds(232, 90, 50, 40);
		frmCalculadora.getContentPane().add(div);
		div.setText("\u00F7");

		JButton menos = new JButton("-");
		menos.setFont(new Font("Times New Roman", Font.BOLD, 26));
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[0] == "") {
					textArea.setText("");
				} else {
					saida[1] = menos.getText();
					textArea.setText(saida[0] + " " + saida[1]);
				}
			}
		});
		menos.setBounds(232, 199, 50, 40);
		frmCalculadora.getContentPane().add(menos);
		menos.setText(menos.getLabel());

		JButton mais = new JButton("+");
		mais.setFont(new Font("Times New Roman", Font.BOLD, 26));
		mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (saida[0] == "") {
					textArea.setText("");
				} else {
					saida[1] = mais.getText();
					textArea.setText(saida[0] + " " + saida[1]);
				}
			}
		});
		mais.setBounds(232, 250, 50, 40);
		frmCalculadora.getContentPane().add(mais);

		JButton igual = new JButton("=");
		igual.setFont(new Font("Times New Roman", Font.BOLD, 18));
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (div.getText().equals(saida[1])) {
					saida[3] = "" + calc.divisao(Float.parseFloat(saida[0]), Float.parseFloat(saida[2]));
					textArea.setText(saida[0] + " " + saida[1] + " " + saida[2] + " = " + saida[3]);
					saida[0] = saida[3];
					saida[1] = "";
					saida[2] = "";
				} else if (mult.getText().equals(saida[1])) {
					saida[3] = "" + calc.multiplicacao(Float.parseFloat(saida[0]), Float.parseFloat(saida[2]));
					textArea.setText(saida[0] + " " + saida[1] + " " + saida[2] + " = " + saida[3]);
					saida[0] = saida[3];
					saida[1] = "";
					saida[2] = "";
				} else if (menos.getText().equals(saida[1])) {
					saida[3] = "" + calc.subtracao(Float.parseFloat(saida[0]), Float.parseFloat(saida[2]));
					textArea.setText(saida[0] + " " + saida[1] + " " + saida[2] + " = " + saida[3]);
					saida[0] = saida[3];
					saida[1] = "";
					saida[2] = "";
				} else if (mais.getText().equals(saida[1])) {
					saida[3] = "" + calc.soma(Float.parseFloat(saida[0]), Float.parseFloat(saida[2]));

					textArea.setText(saida[0] + " " + saida[1] + " " + saida[2] + " = " + saida[3]);
					saida[0] = saida[3];
					saida[1] = "";
					saida[2] = "";
				}
			}
		});

		igual.setBounds(150, 250, 50, 40);
		frmCalculadora.getContentPane().add(igual);

		JButton btnNewButton = new JButton("LIMPAR ");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				saida[0] = "";
				saida[1] = "";
				saida[2] = "";
				saida[3] = "";
			}
		});
		btnNewButton.setBounds(10, 56, 275, 30);
		frmCalculadora.getContentPane().add(btnNewButton);
	}

	public class Calculadora {

		float soma(float n1, float n2) {

			return n1 + n2;
		}

		float subtracao(float n1, float n2) {

			return n1 - n2;
		}

		float multiplicacao(float n1, float n2) {

			return n1 * n2;
		}

		float divisao(float n1, float n2) {

			return n1 / n2;
		}
	}
}
