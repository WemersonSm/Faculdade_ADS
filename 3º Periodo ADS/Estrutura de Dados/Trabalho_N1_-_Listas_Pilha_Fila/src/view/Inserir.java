package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JLabel;
//import javax.swing.JTextPane;
import javax.swing.JOptionPane;

import br.com.listas.EmptyListException;
import br.com.listas.Fila;
import br.com.listas.Lista;
import br.com.listas.Pilha;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Inserir extends JInternalFrame implements ActionListener {
	static public Lista list = null;
	static public Pilha pilha;
	static public Fila fila;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String ins;
	private JButton btnLista;
	private JButton btnPilha;
	private JButton btnFila;
	private JSeparator separator;
	private JButton btnInicio;
	private JButton btnFim;
	private JButton btnPos;
	private JSeparator separator_1;
	private JLabel lblNewLabel;
	private JLabel lblOpcaoEscolhida;
	private JTextField textFieldInserirInicio;
	private JTextField textFieldInserirFim;
	private JTextField textFieldPositionValor;
	private JTextArea textArea;
	private JButton btnVoltar;
	private JTextField textFieldPositionPos;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblEscolha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Inserir frame = new Inserir();
					// frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public Inserir() {
		setTitle("Inserir Elemento");
		setBounds(100, 100, 520, 500);
		getContentPane().setLayout(null);

		this.btnLista = new JButton("(1) \u2013 Lista Simplesmente Encadeada");
		this.btnLista.addActionListener(this);
		this.btnLista.setBounds(10, 55, 286, 23);
		getContentPane().add(this.btnLista);

		this.btnPilha = new JButton("(2) \u2013 Pilha");
		this.btnPilha.addActionListener(this);
		this.btnPilha.setBounds(306, 55, 89, 23);
		getContentPane().add(this.btnPilha);

		this.btnFila = new JButton("(3) - Fila");
		this.btnFila.addActionListener(this);
		this.btnFila.setBounds(405, 55, 89, 23);
		getContentPane().add(this.btnFila);

		this.separator = new JSeparator();
		this.separator.setBounds(10, 89, 484, 8);
		getContentPane().add(this.separator);

		this.btnInicio = new JButton("(1) \u2013 Inserir no Inicio");
		this.btnInicio.addActionListener(this);
		this.btnInicio.setBounds(10, 132, 171, 23);
		getContentPane().add(this.btnInicio);
		this.btnInicio.setEnabled(false);

		this.btnFim = new JButton("(2) \u2013 Inserir no Fim");
		this.btnFim.addActionListener(this);
		this.btnFim.setBounds(10, 166, 171, 23);
		getContentPane().add(this.btnFim);
		this.btnFim.setEnabled(false);

		this.btnPos = new JButton("(3) \u2013 Inserir Por posi\u00E7\u00E3o");
		this.btnPos.addActionListener(this);
		this.btnPos.setBounds(10, 219, 171, 23);
		getContentPane().add(this.btnPos);
		this.btnPos.setEnabled(false);

		this.separator_1 = new JSeparator();
		this.separator_1.setBounds(10, 243, 484, 8);
		getContentPane().add(this.separator_1);

		this.lblNewLabel = new JLabel("ESCOLHA UMA OP\u00C7\u00C3O");
		this.lblNewLabel.setBounds(171, 11, 155, 14);
		getContentPane().add(this.lblNewLabel);

		this.lblOpcaoEscolhida = new JLabel("OPCAO ESCOLHIDA:");
		this.lblOpcaoEscolhida.setBounds(56, 98, 125, 23);
		getContentPane().add(this.lblOpcaoEscolhida);

		this.textFieldInserirInicio = new JTextField();
		this.textFieldInserirInicio.setBounds(191, 133, 155, 20);
		getContentPane().add(this.textFieldInserirInicio);
		this.textFieldInserirInicio.setColumns(10);
		this.textFieldInserirInicio.setEnabled(false);
		textFieldInserirInicio.setText("");

		this.textFieldInserirFim = new JTextField();
		this.textFieldInserirFim.setBounds(191, 167, 155, 20);
		getContentPane().add(this.textFieldInserirFim);
		this.textFieldInserirFim.setColumns(10);
		this.textFieldInserirFim.setEnabled(false);
		this.textFieldInserirFim.setText("");

		this.textFieldPositionValor = new JTextField();
		this.textFieldPositionValor.setBounds(274, 220, 72, 20);
		getContentPane().add(this.textFieldPositionValor);
		this.textFieldPositionValor.setColumns(10);
		this.textFieldPositionValor.setEnabled(false);
		this.textFieldPositionValor.setText("");

		this.textArea = new JTextArea();
		this.textArea.setBounds(10, 256, 484, 203);
		getContentPane().add(this.textArea);

		this.btnVoltar = new JButton("VOLTAR OPCAO");
		this.btnVoltar.addActionListener(this);
		this.btnVoltar.setBounds(356, 132, 138, 23);
		getContentPane().add(this.btnVoltar);

		this.textFieldPositionPos = new JTextField();
		this.textFieldPositionPos.setEnabled(false);
		this.textFieldPositionPos.setColumns(10);
		this.textFieldPositionPos.setBounds(191, 220, 73, 20);
		getContentPane().add(this.textFieldPositionPos);
		this.textFieldPositionPos.setEnabled(false);
		this.textFieldPositionPos.setText("");

		this.lblNewLabel_1 = new JLabel("VALOR");
		this.lblNewLabel_1.setBounds(280, 198, 46, 14);
		getContentPane().add(this.lblNewLabel_1);

		this.lblNewLabel_2 = new JLabel("POS");
		this.lblNewLabel_2.setBounds(201, 198, 46, 14);
		getContentPane().add(this.lblNewLabel_2);

		this.lblEscolha = new JLabel("");
		this.lblEscolha.setBounds(194, 98, 188, 23);
		getContentPane().add(this.lblEscolha);
		setLocation(20, 20);
		ins = "ins";

	}

	public Lista getList() {
		return list;
	}

	public Pilha getPilha() {
		return pilha;
	}

	public Fila getFila() {
		return fila;
	}


	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnFila) {
			actionPerformedBtnFila(e);
		}
		if (e.getSource() == this.btnPilha) {
			actionPerformedBtnPilha(e);
		}
		if (e.getSource() == this.btnPos) {
			actionPerformedBtnPos(e);
		}
		if (e.getSource() == this.btnFim) {
			actionPerformedBtnFim(e);
		}
		if (e.getSource() == this.btnVoltar) {
			actionPerformedbtnVoltar(e);
		}
		if (e.getSource() == this.btnInicio) {
			actionPerformedbtnInicio(e);
		}
		if (e.getSource() == this.btnLista) {
			actionPerformedBtnLista(e);
		}
	}

	protected void actionPerformedBtnLista(ActionEvent e) {
		if (list == null) {
			list = new Lista();
			textArea.setText(list.print());
		} else {
			// list=list;
			textArea.setText(list.print());
		}
		this.lblEscolha.setText("LISTA ENCADEADA");
		this.textFieldInserirInicio.setEnabled(true);
		this.textFieldInserirFim.setEnabled(true);
		this.textFieldPositionValor.setEnabled(true);
		this.textFieldPositionPos.setEnabled(true);
		this.btnLista.setEnabled(false);
		this.btnFila.setEnabled(false);
		this.btnPilha.setEnabled(false);
		this.btnInicio.setEnabled(true);
		this.btnFim.setEnabled(true);
		this.btnPos.setEnabled(true);
		
	}

	protected void actionPerformedbtnVoltar(ActionEvent e) {
		this.textFieldInserirInicio.setEnabled(false);
		this.textFieldInserirFim.setEnabled(false);
		this.textFieldPositionValor.setEnabled(false);
		this.textFieldPositionPos.setEnabled(false);
		this.btnLista.setEnabled(true);
		this.btnFila.setEnabled(true);
		this.btnPilha.setEnabled(true);
		this.btnInicio.setEnabled(false);
		this.btnFim.setEnabled(false);
		this.btnPos.setEnabled(false);
		this.btnFim.setText("(2) – Inserir no Fim");
		this.lblEscolha.setText("");
		this.textArea.setText("");

	}

	protected void actionPerformedbtnInicio(ActionEvent e) {
		if (textFieldInserirInicio.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Insira um valor");
		} else {
			if (lblEscolha.getText().equalsIgnoreCase("LISTA ENCADEADA")) {
				list.insereNoInicio(Integer.parseInt(textFieldInserirInicio.getText()));
				textArea.setText(list.print());
			}
		}
		textFieldInserirInicio.setText("");
	}

	protected void actionPerformedBtnFim(ActionEvent e) {
		if (textFieldInserirFim.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Insira um valor");
		} else {
			if (lblEscolha.getText().equalsIgnoreCase("LISTA ENCADEADA")) {
				list.insereNoFim(Integer.parseInt(textFieldInserirFim.getText()));
				textArea.setText(list.print());
			} else if (lblEscolha.getText().equalsIgnoreCase("PILHA")) {
				pilha.empilha((Integer.parseInt(textFieldInserirFim.getText())));
				textArea.setText(pilha.print());
			} else if (lblEscolha.getText().equalsIgnoreCase("FILA")) {
				fila.enfileira((Integer.parseInt(textFieldInserirFim.getText())));
				textArea.setText(fila.print());
			}
		}
		this.textFieldInserirFim.setText("");
	}

	protected void actionPerformedBtnPos(ActionEvent e) {
		if (textFieldPositionPos.getText().equals("") && textFieldPositionValor.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Insira uma posição e um valor");
		} else {
			try {
				list.insertAtPosicao(Integer.parseInt(textFieldPositionPos.getText()),
						Integer.parseInt(textFieldPositionValor.getText()));
		//	} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
			//	JOptionPane.showInternalMessageDialog(null, e1.getMessage());
		//	
				} 
			catch (EmptyListException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showInternalMessageDialog(null, e1.getMessage());
			}
			textArea.setText(list.print());
		}
		this.textFieldPositionPos.setText("");
		this.textFieldPositionValor.setText("");
	}

	protected void actionPerformedBtnPilha(ActionEvent e) {
		if (pilha == null) {
			pilha = new Pilha();
			textArea.setText(pilha.print());
		} else {
			// list=list;
			textArea.setText(pilha.print());
		}
		this.lblEscolha.setText("PILHA");
		//this.textFieldInserirInicio.setEnabled(true);
		this.textFieldInserirFim.setEnabled(true);
		this.btnFim.setText("(2) – Empilha");
		// this.textFieldPositionPos.setEnabled(true);
		this.btnLista.setEnabled(false);
		this.btnFila.setEnabled(false);
		this.btnPilha.setEnabled(false);
		// this.btnInicio.setEnabled(true);
		this.btnFim.setEnabled(true);
		// this.btnPos.setEnabled(true);
	}

	protected void actionPerformedBtnFila(ActionEvent e) {
		if (fila == null) {
			fila = new Fila();
			textArea.setText(fila.print());
		} else {
			// list=list;
			textArea.setText(fila.print());
		}
		this.lblEscolha.setText("FILA");
		//this.textFieldInserirInicio.setEnabled(true);
		 this.textFieldInserirFim.setEnabled(true);
		// this.textFieldPositionValor.setEnabled(true);
		// this.textFieldPositionPos.setEnabled(true);
		this.btnFim.setText("(1) – Enfileira");
	//	this.btnInicio.setText("(1) – Dezenfileira");
		this.btnLista.setEnabled(false);
		this.btnFila.setEnabled(false);
		this.btnPilha.setEnabled(false);
		//this.btnInicio.setEnabled(true);
		 this.btnFim.setEnabled(true);
		// this.btnPos.setEnabled(true);
	}
}
