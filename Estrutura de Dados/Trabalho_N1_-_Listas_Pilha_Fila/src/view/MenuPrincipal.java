package view;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;

public class MenuPrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu MenuRegist;
	private JMenuItem MenuItemInserir;
	public static JDesktopPane painelCentral;
	private JMenu MenuSistema;
	private JMenuItem MenuItemSair;
	private JMenuItem MenuItemRemover;
	private JMenuItem MenuItemBuscar;
	private JMenuItem MenuItemImprimir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public MenuPrincipal() {
		setTitle("Menu Principal");
		// setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/img/bandeira-do-brasil.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		this.menuBar = new JMenuBar();
		setJMenuBar(this.menuBar);

		this.MenuSistema = new JMenu("Sistema");
		this.menuBar.add(this.MenuSistema);

		this.MenuItemSair = new JMenuItem("Sair");
		this.MenuItemSair.addActionListener(this);
		this.MenuSistema.add(this.MenuItemSair);

		this.MenuRegist = new JMenu("Menu - Fila - Lista - Pilha");
		this.menuBar.add(this.MenuRegist);

		this.MenuItemInserir = new JMenuItem("(1) Inserir Novo Elemento");
		this.MenuItemInserir.addActionListener(this);
		this.MenuRegist.add(this.MenuItemInserir);

		this.MenuItemRemover = new JMenuItem("(2) Remover Elemento");
		this.MenuItemRemover.addActionListener(this);
		this.MenuRegist.add(this.MenuItemRemover);

		this.MenuItemBuscar = new JMenuItem("(3) Buscar Elemento");
		this.MenuItemBuscar.addActionListener(this);
		this.MenuRegist.add(this.MenuItemBuscar);

		this.MenuItemImprimir = new JMenuItem("(4) Imprimir Elemento");
		this.MenuItemImprimir.addActionListener(this);
		this.MenuRegist.add(this.MenuItemImprimir);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new CardLayout(0, 0));

		MenuPrincipal.painelCentral = new JDesktopPane();
		this.contentPane.add(MenuPrincipal.painelCentral, "name_94643762124100");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.MenuItemSair) {
			actionPerformedMenuItemSair(e);
		}
		if (e.getSource() == this.MenuItemImprimir) {
			actionPerformedMenuItemImprimir(e);
		}

		if (e.getSource() == this.MenuItemBuscar) {
			actionPerformedMenuItemBuscar(e);
		}
		if (e.getSource() == this.MenuItemRemover) {
			actionPerformedMenuItemRemover(e);
		}
		if (e.getSource() == this.MenuItemInserir) {
			actionPerformedMenuItemInserir(e);
		}
	}

	protected void actionPerformedMenuItemSair(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedMenuItemInserir(ActionEvent e) {
		String tela1 = Inserir.ins;
		try {
			if (tela1 == null) {
				Inserir in = new Inserir();
				painelCentral.add(in);
				in.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Já esta Aberto");
			}

		} catch (Exception e2) {
		}
	}

	protected void actionPerformedMenuItemRemover(ActionEvent e) {
		String tela2 = Remover.rem;
		try {
			if (tela2 == null) {
				Remover remm = new Remover();
				painelCentral.add(remm);
				remm.setVisible(true);
				Inserir.ins=null;
			} else {
				JOptionPane.showMessageDialog(null, "Já esta Aberto");
			}

		} catch (Exception e2) {
		}
	}

	protected void actionPerformedMenuItemBuscar(ActionEvent e) {
		String tela3 = Buscar.bus;
		try {
			if (tela3 == null) {
				Buscar buss = new Buscar();
				painelCentral.add(buss);
				buss.setVisible(true);
				Inserir.ins=null;
			} else {
				JOptionPane.showMessageDialog(null, "Já esta Aberto");
			}

		} catch (Exception e2) {
		}

	}

	private void actionPerformedMenuItemImprimir(ActionEvent e) {
		String tela4 = Imprimir.imp;
		try {
			if (tela4 == null) {
				Imprimir in = new Imprimir();
				painelCentral.add(in);
				in.setVisible(true);
				Inserir.ins=null;
			} else {
				JOptionPane.showMessageDialog(null, "Já esta Aberto");
			}

		} catch (Exception e2) {
		}

	}
}
