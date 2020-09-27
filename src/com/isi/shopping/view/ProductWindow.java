package com.isi.shopping.view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JTextField;

public class ProductWindow extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private JButton productsButton;
	private JButton cartButton;
	private JButton logoutButton;
	private JLabel productNameLabel;
	//private JTextField productNameTextField;
	private JLabel quantityLabel;
	//private JTextField quantityTextField;
	private JLabel priceLabel;
	//private JTextField priceTextField;
	private JButton buyButton;
	private JLabel totalTitleLabel;
	private JLabel totalLabel;
	private JButton checkoutButton;
	
	private JPanel navigationPanel;
	private JPanel productDetailsPanel;
	private JPanel footerPanel;
	private JPanel contentPane;
	
	public ProductWindow()
	{
		super("Products");
		
		createComponents();
		initializeContainers();
		addComponentsToContainers();
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void createComponents() {
		// TODO Auto-generated method stub
		productsButton = new JButton("Products");
		cartButton = new JButton("Cart");
		logoutButton = new JButton("Logout");
		
		productNameLabel = new JLabel("Banana");
		//productNameTextField = new JTextField(5);
		//productNameTextField.setMaximumSize(new Dimension(100, productNameTextField.getMaximumSize().height));
		
		quantityLabel = new JLabel("10");
		//quantityTextField = new JTextField(5);
		//quantityTextField.setMaximumSize(new Dimension(100, quantityTextField.getMaximumSize().height));
		
		priceLabel = new JLabel("$1.5");
		//priceTextField = new JTextField(5);
	//	priceTextField.setMaximumSize(new Dimension(100, priceTextField.getMaximumSize().height));
		
		totalTitleLabel = new JLabel("Total");
		totalLabel = new JLabel("0.0");
		checkoutButton = new JButton("Checkout");
		
		
		buyButton = new JButton("Buy Now");
	
	}

	private void initializeContainers() {
		// TODO Auto-generated method stub
		navigationPanel = new JPanel();
		navigationPanel.setLayout(new BoxLayout(navigationPanel, BoxLayout.X_AXIS));
		
		productDetailsPanel = new JPanel();
		productDetailsPanel.setLayout(new GridLayout(4,4));
		
		footerPanel = new JPanel();
		footerPanel.setLayout(new BoxLayout(footerPanel, BoxLayout.X_AXIS));
		
		contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	}
	
	private void addComponentsToContainers() {
		// TODO Auto-generated method stub

		Dimension rigidAreaWidth = new Dimension(20, 20);
		
		navigationPanel.add(productsButton);
		navigationPanel.add(Box.createRigidArea(rigidAreaWidth));
		
		navigationPanel.add(cartButton);
		navigationPanel.add(Box.createRigidArea(rigidAreaWidth));
		
		navigationPanel.add(logoutButton);
		navigationPanel.add(Box.createRigidArea(rigidAreaWidth));
		
		productDetailsPanel.add(productNameLabel);
		productDetailsPanel.add(Box.createRigidArea(rigidAreaWidth));
		//productDetailsPanel.add(productNameTextField);
		
		
		productDetailsPanel.add(quantityLabel);
		productDetailsPanel.add(Box.createRigidArea(rigidAreaWidth));
		//productDetailsPanel.add(quantityTextField);
		
		productDetailsPanel.add(priceLabel);
		productDetailsPanel.add(Box.createRigidArea(rigidAreaWidth));
		//productDetailsPanel.add(priceTextField);
		
		//productDetailsPanel.add(Box.createRigidArea(rigidAreaWidth));
		productDetailsPanel.add(buyButton);
		
		footerPanel.add(totalTitleLabel);
		footerPanel.add(Box.createRigidArea(rigidAreaWidth));
		
		footerPanel.add(totalLabel);
		footerPanel.add(Box.createRigidArea(rigidAreaWidth));
		
		footerPanel.add(checkoutButton);
		
		contentPane.add(navigationPanel);
		contentPane.add(Box.createRigidArea(rigidAreaWidth));
		contentPane.add(productDetailsPanel);
		contentPane.add(Box.createRigidArea(rigidAreaWidth));
		contentPane.add(footerPanel);
		contentPane.add(Box.createRigidArea(rigidAreaWidth));
		
	}
	
}
