package view;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import br.com.listas.EmptyListException;
import br.com.listas.Fila;
import br.com.listas.Lista;
import br.com.listas.Pilha;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Remover extends JInternalFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String rem;
	private JLabel lblNewLabel;
	private JButton btnLista;
	private JButton btnPilha;
	private JButton btnFila;
	private JSeparator separator;
	private JLabel lblOpcaoEscolhida;
	private JLabel lblEscolha;
	private JButton btnInicio;
	private JTextField textFieldRemInicio;
	private JTextField textFieldRemoveFim;
	private JButton btnFim;
	private JButton btnPos;
	private JTextField textField_Pos;
	private JLabel lblNewLabel_2;
	private JButton btnVoltar;
	private JTextArea textArea;
	private JSeparator separator_1;
	private JButton btnValor;
	private JTextField textFieldValor;

	Inserir ins = new Inserir();
	public Lista listaRemover = null;
	public Pilha pilhaRemover = null;
	public Fila filaRemover = null;
	Object removedObject = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Remover frame = new Remover();
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

	public Remover() {

		setTitle("Remover Elemento");
		setBounds(100, 100, 520, 500);
		setLocation(560, 20);
		getContentPane().setLayout(null);

		this.lblNewLabel = new JLabel("ESCOLHA UMA OP\u00C7\u00C3O");
		this.lblNewLabel.setBounds(171, 11, 155, 14);
		getContentPane().add(this.lblNewLabel);

		this.btnLista = new JButton("(1) \u2013 Lista Simplesmente Encadeada");
		this.btnLista.addActionListener(this);
		this.btnLista.setBounds(10, 55, 286, 23);
		getContentPane().add(this.btnLista);
		// this.btnLista.setEnabled(false);

		this.btnPilha = new JButton("(2) \u2013 Pilha");
		this.btnPilha.addActionListener(this);
		this.btnPilha.setBounds(306, 55, 89, 23);
		getContentPane().add(this.btnPilha);

		this.btnFila = new JButton("(3) - Fila");
		this.btnFila.addActionListener(this);
		this.btnFila.setBounds(405, 55, 89, 23);
		getContentPane().add(this.btnFila);

		this.separator = new JSeparator();
		this.separator.setBounds(0, 89, 484, 8);
		getContentPane().add(this.separator);

		this.lblOpcaoEscolhida = new JLabel("OPCAO ESCOLHIDA:");
		this.lblOpcaoEscolhida.setBounds(56, 98, 125, 23);
		getContentPane().add(this.lblOpcaoEscolhida);

		this.lblEscolha = new JLabel("");
		this.lblEscolha.setBounds(194, 98, 188, 23);
		getContentPane().add(this.lblEscolha);

		this.btnInicio = new JButton("(1) \u2013 Remover no Inicio");
		this.btnInicio.addActionListener(this);
		this.btnInicio.setEnabled(false);
		this.btnInicio.setBounds(10, 132, 171, 23);
		getContentPane().add(this.btnInicio);

		this.textFieldRemInicio = new JTextField();
		this.textFieldRemInicio.setText("");
		this.textFieldRemInicio.setEnabled(false);
		this.textFieldRemInicio.setColumns(10);
		this.textFieldRemInicio.setBounds(191, 133, 155, 20);
		getContentPane().add(this.textFieldRemInicio);

		this.textFieldRemoveFim = new JTextField();
		this.textFieldRemoveFim.setText("");
		this.textFieldRemoveFim.setEnabled(false);
		this.textFieldRemoveFim.setColumns(10);
		this.textFieldRemoveFim.setBounds(191, 167, 155, 20);
		getContentPane().add(this.textFieldRemoveFim);

		this.btnFim = new JButton("(2) \u2013 Remover no Fim");
		this.btnFim.addActionListener(this);
		this.btnFim.setEnabled(false);
		this.btnFim.setBounds(10, 166, 171, 23);
		getContentPane().add(this.btnFim);

		this.btnPos = new JButton("(4) \u2013 Remover Por posi\u00E7\u00E3o");
		this.btnPos.addActionListener(this);
		this.btnPos.setEnabled(false);
		this.btnPos.setBounds(10, 255, 207, 23);
		getContentPane().add(this.btnPos);

		this.textField_Pos = new JTextField();
		this.textField_Pos.setText("");
		this.textField_Pos.setEnabled(false);
		this.textField_Pos.setColumns(10);
		this.textField_Pos.setBounds(227, 256, 73, 20);
		getContentPane().add(this.textField_Pos);

		this.lblNewLabel_2 = new JLabel("POS");
		this.lblNewLabel_2.setBounds(237, 234, 46, 14);
		getContentPane().add(this.lblNewLabel_2);

		this.btnVoltar = new JButton("VOLTAR OPCAO");
		this.btnVoltar.addActionListener(this);
		this.btnVoltar.setBounds(356, 132, 138, 23);
		getContentPane().add(this.btnVoltar);

		this.textArea = new JTextArea();
		this.textArea.setBounds(10, 308, 484, 151);
		getContentPane().add(this.textArea);

		this.separator_1 = new JSeparator();
		this.separator_1.setBounds(10, 289, 484, 8);
		getContentPane().add(this.separator_1);

		this.btnValor = new JButton("(3) \u2013 Remover Por Valor");
		this.btnValor.addActionListener(this);
		this.btnValor.setEnabled(false);
		this.btnValor.setBounds(10, 200, 171, 23);
		getContentPane().add(this.btnValor);

		this.textFieldValor = new JTextField();
		this.textFieldValor.setText("");
		this.textFieldValor.setEnabled(false);
		this.textFieldValor.setColumns(10);
		this.textFieldValor.setBounds(191, 203, 155, 20);
		getContentPane().add(this.textFieldValor);
		rem = "rem";
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnPos) {
			actionPerformedBtnPos(e);
		}
		if (e.getSource() == this.btnValor) {
			actionPerformedBtnValor(e);
		}
		if (e.getSource() == this.btnInicio) {
			actionPerformedBtnInicio(e);
		}
		if (e.getSource() == this.btnFim) {
			actionPerformedBtnFim(e);
		}
		if (e.getSource() == this.btnFila) {
			actionPerformedBtnFila(e);
		}
		if (e.getSource() == this.btnPilha) {
			actionPerformedBtnPilha(e);
		}
		if (e.getSource() == this.btnVoltar) {
			actionPerformedBtnVoltar(e);
		}
		if (e.getSource() == this.btnLista) {
			actionPerformedBtnLista(e);
		}
	}

	protected void actionPerformedBtnLista(ActionEvent e) {
		listaRemover = ins.getList();
		if (listaRemover != null) {
			textArea.setText(listaRemover.print());
			this.lblEscolha.setText("LISTA ENCADEADA");
			// this.textFieldRemInicio.setEnabled(true);
			// this.textFieldRemoveFim.setEnabled(true);
			//this.textField_RemPos_Valor.setEnabled(true);
			this.textField_Pos.setEnabled(true);
			this.textFieldValor.setEnabled(true);
			this.btnLista.setEnabled(false);
			this.btnFila.setEnabled(false);
			this.btnPilha.setEnabled(false);
			this.btnInicio.setEnabled(true);
			this.btnFim.setEnabled(true);
			this.btnPos.setEnabled(true);
			this.btnValor.setEnabled(true);
		} else {
			JOptionPane.showMessageDialog(null, "Ainda não foi criada uma lista");
		}

	}

	protected void actionPerformedBtnVoltar(ActionEvent e) {
		this.textFieldRemInicio.setEnabled(false);
		this.textFieldRemoveFim.setEnabled(false);
	//	this.textField_RemPos_Valor.setEnabled(false);
		this.textField_Pos.setEnabled(false);
		this.textFieldValor.setEnabled(false);
		this.btnLista.setEnabled(true);
		this.btnFila.setEnabled(true);
		this.btnPilha.setEnabled(true);
		this.btnInicio.setEnabled(false);
		this.btnFim.setEnabled(false);
		this.btnPos.setEnabled(false);
		this.btnValor.setEnabled(false);
		this.btnFim.setText("(2) – Inserir no Fim");
		this.lblEscolha.setText("");
		this.textArea.setText("");
	}

	protected void actionPerformedBtnPilha(ActionEvent e) {
		pilhaRemover = ins.getPilha();
		if (pilhaRemover != null) {
			textArea.setText(pilhaRemover.print());
			this.lblEscolha.setText("PILHA");
			// this.textFieldRemInicio.setEnabled(true);
			// this.textFieldRemoveFim.setEnabled(true);
			// this.textField_RemPos_Valor.setEnabled(true);
			// this.textField_RemPos.setEnabled(true);
			// this.textFieldRemoValor.setEnabled(true);
			this.btnLista.setEnabled(false);
			this.btnFila.setEnabled(false);
			this.btnPilha.setEnabled(false);
			// this.btnInicio.setEnabled(true);
			this.btnFim.setEnabled(true);
			// this.btnPos.setEnabled(true);
			// this.btnValor.setEnabled(true);
			this.btnFim.setText("(1) – Desempilha");
		} else {
			JOptionPane.showMessageDialog(null, "Ainda não foi criada uma Pilha");
		}

	}

	protected void actionPerformedBtnFila(ActionEvent e) {
		filaRemover = ins.getFila();
		if (filaRemover != null) {
			textArea.setText(filaRemover.print());
			this.lblEscolha.setText("FILA");
			// this.textFieldRemInicio.setEnabled(true);
			// this.textFieldRemoveFim.setEnabled(true);
			// this.textField_RemPos_Valor.setEnabled(true);
			// this.textField_RemPos.setEnabled(true);
			// this.textFieldRemoValor.setEnabled(true);
			this.btnLista.setEnabled(false);
			this.btnFila.setEnabled(false);
			this.btnPilha.setEnabled(false);
			this.btnInicio.setText("(1) – Desenfileira");
			this.btnInicio.setEnabled(true);
			// this.btnFim.setEnabled(true);
			// this.btnPos.setEnabled(true);
			// this.btnValor.setEnabled(true);
			// this.btnFim.setText("(2) – Desempilha");
		} else {
			JOptionPane.showMessageDialog(null, "Ainda não foi criada uma Fila");
		}

	}

	protected void actionPerformedBtnFim(ActionEvent e) {

		if (lblEscolha.getText().equalsIgnoreCase("LISTA ENCADEADA")) {
			try {
				removedObject = listaRemover.removeNoFim();
				textArea.setText(" Removido da Lista\n" + removedObject + "\n" + listaRemover.print());
			} catch (EmptyListException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showInternalMessageDialog(null, e1.getMessage());
			}
		} else if (lblEscolha.getText().equalsIgnoreCase("PILHA")) {

			try {
				removedObject = pilhaRemover.desempilha();
				textArea.setText(" Removido da pilha\n" + removedObject + "\n" + pilhaRemover.print());
			} catch (EmptyListException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showInternalMessageDialog(null, e1.getMessage());
			}
		}
	}

	protected void actionPerformedBtnInicio(ActionEvent e) {
		// if (textFieldRemInicio.getText().equals("")) {
		// JOptionPane.showMessageDialog(null, "Insira um valor");
		// } else {
		if (lblEscolha.getText().equalsIgnoreCase("LISTA ENCADEADA")) {
			try {
				removedObject = listaRemover.removeNoInicio();
				textArea.setText(" Removido da Lista\n" + removedObject + "\n" + listaRemover.print());
			} catch (EmptyListException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showInternalMessageDialog(null, e1.getMessage());
			}
		} else if (lblEscolha.getText().equalsIgnoreCase("PILHA")) {
			try {
				removedObject = filaRemover.desenfileira();
				textArea.setText(" Removido da pilha\n" + removedObject + "\n" + filaRemover.print());
			} catch (EmptyListException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showInternalMessageDialog(null, e1.getMessage());
			}
		}

	}

	protected void actionPerformedBtnValor(ActionEvent e) {
		if (textFieldValor.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Insira um valor");
		} else {
			try {
				removedObject = listaRemover.removeFromValor(Integer.parseInt(textFieldValor.getText()));
				textArea.setText(" Removido da Lista\n" + removedObject + "\n" + listaRemover.print());
				textFieldValor.setText("");
			} catch (EmptyListException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showInternalMessageDialog(null, e1.getMessage());
			}
		}
	}
	protected void actionPerformedBtnPos(ActionEvent e) {
		if (textField_Pos.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Insira um valor");
		} else {
			try {
				removedObject = listaRemover.removeFromPosicao(Integer.parseInt(textField_Pos.getText()));
				textArea.setText(" Removido da Lista\n" + removedObject + "\n" + listaRemover.print());
				textField_Pos.setText("");
			} catch (EmptyListException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showInternalMessageDialog(null, e1.getMessage());
			}
		}
		
	}
}
