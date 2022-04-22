package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import br.com.listas.Fila;
import br.com.listas.Lista;
import br.com.listas.Pilha;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buscar extends JInternalFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String bus;
	private JLabel lblNewLabel;
	private JButton btnLista;
	private JButton btnPilha;
	private JButton btnFila;
	private JSeparator separator;
	private JButton btnVoltar;
	private JTextField textFieldBusca;
	private JButton btnBusca;
	private JTextArea textArea;
	private JSeparator separator_1;

	Inserir ins = new Inserir();
	public Lista listaBuscar = null;
	public Pilha pilhaBuscar = null;
	public Fila filaBuscar = null;
	private JLabel lblOpcaoEscolhida;
	private JLabel lblEscolha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Buscar frame = new Buscar();
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
	public Buscar() {
		setTitle("Busca Elemento");
		setBounds(100, 100, 520, 500);
		setLocation(1110, 20);
		getContentPane().setLayout(null);

		this.lblNewLabel = new JLabel("ESCOLHA UMA OP\u00C7\u00C3O");
		this.lblNewLabel.setBounds(171, 11, 155, 14);
		getContentPane().add(this.lblNewLabel);

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

		this.btnVoltar = new JButton("VOLTAR OPCAO");
		this.btnVoltar.addActionListener(this);
		this.btnVoltar.setBounds(356, 132, 138, 23);
		getContentPane().add(this.btnVoltar);

		this.textFieldBusca = new JTextField();
		this.textFieldBusca.setText("");
		this.textFieldBusca.setEnabled(false);
		this.textFieldBusca.setColumns(10);
		this.textFieldBusca.setBounds(191, 133, 155, 20);
		getContentPane().add(this.textFieldBusca);

		this.btnBusca = new JButton("(1) \u2013 Busca");
		this.btnBusca.addActionListener(this);
		this.btnBusca.setEnabled(false);
		this.btnBusca.setBounds(10, 132, 171, 23);
		getContentPane().add(this.btnBusca);

		this.textArea = new JTextArea();
		this.textArea.setBounds(10, 308, 484, 151);
		getContentPane().add(this.textArea);

		this.separator_1 = new JSeparator();
		this.separator_1.setBounds(10, 289, 484, 8);
		getContentPane().add(this.separator_1);

		this.lblOpcaoEscolhida = new JLabel("OPCAO ESCOLHIDA:");
		this.lblOpcaoEscolhida.setBounds(55, 98, 125, 23);
		getContentPane().add(this.lblOpcaoEscolhida);

		this.lblEscolha = new JLabel("");
		this.lblEscolha.setBounds(193, 98, 188, 23);
		getContentPane().add(this.lblEscolha);
		bus = "bus";
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnFila) {
			actionPerformedBtnFila(e);
		}
		if (e.getSource() == this.btnPilha) {
			actionPerformedBtnPilha(e);
		}
		if (e.getSource() == this.btnBusca) {
			actionPerformedBtnBusca(e);
		}
		if (e.getSource() == this.btnVoltar) {
			actionPerformedBtnVoltar(e);
		}
		if (e.getSource() == this.btnLista) {
			actionPerformedBtnLista(e);
		}
	}

	protected void actionPerformedBtnLista(ActionEvent e) {
		listaBuscar = ins.getList();
		if (listaBuscar != null) {
			textArea.setText(listaBuscar.print());
			this.lblEscolha.setText("LISTA ENCADEADA");
			this.btnLista.setEnabled(false);
			this.btnPilha.setEnabled(false);
			this.btnFila.setEnabled(false);
			this.btnBusca.setEnabled(true);
			this.textFieldBusca.setEnabled(true);
			this.textFieldBusca.setText("");
		} else {
			JOptionPane.showMessageDialog(null, "Ainda não foi criada uma Lista");
		}
	}

	protected void actionPerformedBtnVoltar(ActionEvent e) {
		this.lblEscolha.setText("");
		this.btnLista.setEnabled(true);
		this.btnPilha.setEnabled(true);
		this.btnFila.setEnabled(true);
		this.btnBusca.setEnabled(false);
		this.textFieldBusca.setEnabled(false);

	}

	protected void actionPerformedBtnBusca(ActionEvent e) {
		if (textFieldBusca.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Insira um valor");
		} else {
			if (lblEscolha.getText().equalsIgnoreCase("LISTA ENCADEADA")) {
				textArea.setText(listaBuscar.buscaElemento(Integer.parseInt(textFieldBusca.getText())) + "\n"
						+ listaBuscar.print());
				textFieldBusca.setText("");
			} else if (lblEscolha.getText().equalsIgnoreCase("PILHA")) {
				textArea.setText(pilhaBuscar.buscaElemento(Integer.parseInt(textFieldBusca.getText())) + "\n"
						+ pilhaBuscar.print());
				textFieldBusca.setText("");
			} else if (lblEscolha.getText().equalsIgnoreCase("FILA")) {
				textArea.setText(filaBuscar.buscaElemento(Integer.parseInt(textFieldBusca.getText())) + "\n"
						+ filaBuscar.print());
				textFieldBusca.setText("");
			}
		}
	}

	protected void actionPerformedBtnPilha(ActionEvent e) {
		pilhaBuscar = ins.getPilha();
		if (pilhaBuscar != null) {
			textArea.setText(pilhaBuscar.print());
			this.lblEscolha.setText("PILHA");
			this.btnLista.setEnabled(false);
			this.btnPilha.setEnabled(false);
			this.btnFila.setEnabled(false);
			this.btnBusca.setEnabled(true);
			this.textFieldBusca.setEnabled(true);
			this.textFieldBusca.setText("");
		} else {
			JOptionPane.showMessageDialog(null, "Ainda não foi criada uma Pilha");
		}
	}

	protected void actionPerformedBtnFila(ActionEvent e) {
		filaBuscar = ins.getFila();
		if (filaBuscar != null) {
			textArea.setText(filaBuscar.print());
			this.lblEscolha.setText("FILA");
			this.btnLista.setEnabled(false);
			this.btnPilha.setEnabled(false);
			this.btnFila.setEnabled(false);
			this.btnBusca.setEnabled(true);
			this.textFieldBusca.setEnabled(true);
			this.textFieldBusca.setText("");
		} else {
			JOptionPane.showMessageDialog(null, "Ainda não foi criada uma Pilha");
		}

	}
}
