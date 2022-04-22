package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

import br.com.listas.Fila;
import br.com.listas.Lista;
import br.com.listas.Pilha;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Imprimir extends JInternalFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String imp;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JTextArea textAreaLista;
	private JTextArea textAreaPilha;
	private JTextArea textAreaFila;
	Inserir ins = new Inserir();
	public Lista listaPrint = null;
	public Pilha pilhaPrint = null;
	public Fila filaPrint = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Imprimir frame = new Imprimir();
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
	public Imprimir() {
		setTitle("Imprimir Elemento");
		setBounds(100, 100, 1600, 400);
		setLocation(20, 550);
		getContentPane().setLayout(null);

		this.lblNewLabel = new JLabel("LISTA ENCADEADA");
		this.lblNewLabel.setBounds(57, 99, 109, 14);
		getContentPane().add(this.lblNewLabel);

		this.lblNewLabel_1 = new JLabel("PILHA");
		this.lblNewLabel_1.setBounds(120, 156, 46, 14);
		getContentPane().add(this.lblNewLabel_1);

		this.lblNewLabel_2 = new JLabel("FILA");
		this.lblNewLabel_2.setBounds(120, 223, 46, 14);
		getContentPane().add(this.lblNewLabel_2);

		this.btnNewButton = new JButton("IMPRIMIR ELEMENTOS");
		this.btnNewButton.addActionListener(this);
		this.btnNewButton.setBounds(27, 11, 178, 23);
		getContentPane().add(this.btnNewButton);

		this.textAreaLista = new JTextArea();
		this.textAreaLista.setBounds(176, 75, 1398, 54);
		getContentPane().add(this.textAreaLista);

		this.textAreaPilha = new JTextArea();
		this.textAreaPilha.setBounds(176, 137, 1398, 54);
		getContentPane().add(this.textAreaPilha);

		this.textAreaFila = new JTextArea();
		this.textAreaFila.setBounds(176, 202, 1398, 54);
		getContentPane().add(this.textAreaFila);
		imp = "imp";
		listaPrint = ins.getList();
		pilhaPrint = ins.getPilha();
		filaPrint = ins.getFila();
		if (listaPrint != null) {
			textAreaLista.setText(listaPrint.print());
		} else {
			textAreaLista.setText("NENHUMA LISTA CRIADA");
		}
		if (pilhaPrint != null) {
			textAreaPilha.setText(pilhaPrint.print());
		} else {
			textAreaPilha.setText("NENHUMA PILHA CRIADA");
		}
		if (filaPrint != null) {
			textAreaFila.setText(filaPrint.print());
		} else {
			textAreaFila.setText("NENHUMA FILA CRIADA");
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		listaPrint = ins.getList();
		pilhaPrint = ins.getPilha();
		filaPrint = ins.getFila();
		if (listaPrint != null) {
			textAreaLista.setText(listaPrint.print());
		} else {
			textAreaLista.setText("NENHUMA LISTA CRIADA");
		}
		if (pilhaPrint != null) {
			textAreaPilha.setText(pilhaPrint.print());
		} else {
			textAreaPilha.setText("NENHUMA PILHA CRIADA");
		}
		if (filaPrint != null) {
			textAreaFila.setText(filaPrint.print());
		} else {
			textAreaFila.setText("NENHUMA FILA CRIADA");
		}
	}
}
