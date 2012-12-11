

public class Calculatrice {

	public static void main(String[] argz){

		JFrame frame = new JFrame ("Calculatrice");
		frame.getContentPane().add(new Calcul("Calculatrice"));
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize(300, 300);
		frame.getContentPane().setBackground(Color.RED);
		frame.setVisible( true );
	}
}

class Calcul extends JComponent
	implements ActionListener
{
	String theMessage;
	GridBagConstraints constraints = new GridBagConstraints( );
	String n;
	StringBuilder number= new StringBuilder("0");
	double som=0, a=0, b=0;
	JTextField t= new JTextField("0");
	int length=0, op1=0, op=0, i=0;

	//Création des Boutons
	JButton initial= new JButton("C");
	JButton add= new JButton("+");
	JButton sous= new JButton("-");
	JButton produit= new JButton("*");
	JButton quotient= new JButton("/");
	JButton total= new JButton("=");
	JButton virgule= new JButton (",");
	JButton retour= new JButton("<");

	JButton zero= new JButton("0");
	JButton un= new JButton("1");
	JButton deux= new JButton("2");
	JButton trois= new JButton("3");
	JButton quatre= new JButton("4");
	JButton cinq= new JButton("5");
	JButton six= new JButton("6");
	JButton sept= new JButton("7");
	JButton huit= new JButton("8");
	JButton neuf= new JButton("9");

	public Calcul(String message)
	{
		theMessage = message;

		//Création de l'affichage
		t.setEditable(false);
		t.setHorizontalAlignment(JTextField.RIGHT);

		//Placement des boutons
		setLayout(new GridBagLayout( ));
		constraints.weightx = 1.0;
		constraints.weighty = 1.0;
		constraints.fill = GridBagConstraints.BOTH;
		int x, y;
		//Ajout des composants

		//Première Ligne
		constraints.gridwidth=4;
		addGB(t,x=0,y=0);
		constraints.gridwidth=1;

		//Second Ligne
		addGB(initial,x=0,y=1);
		addGB(retour,x=1,y=1);
		addGB(quotient,x=2,y=1);
		addGB(produit,x=3,y=1);

		//Troisième Ligne
		addGB(sept,x=0,y=2);
		addGB(huit,x=1,y=2);
		addGB(neuf,x=2,y=2);
		addGB(sous,x=3,y=2);

		//Quatrième Ligne
		addGB(quatre,x=0,y=3);
		addGB(cinq,x=1,y=3);
		addGB(six,x=2,y=3);
		addGB(add, x=3, y=3);

		//Cinquième Ligne
		addGB(un,x=0,y=4);
		addGB(deux,x=1,y=4);
		addGB(trois,x=2,y=4);
		constraints.gridheight = 2;
		addGB(total, x=3, y=4);
		constraints.gridheight = 1;

		//Dernière Ligne
		constraints.gridwidth = 2;
		addGB(zero,x=0,y=5);
		constraints.gridwidth = 1;
		addGB(virgule,x=2,y=5);

		//Events
		initial.addActionListener(this);
		retour.addActionListener(this);
		quotient.addActionListener(this);
		produit.addActionListener(this);

		sept.addActionListener(this);
		huit.addActionListener(this);
		neuf.addActionListener(this);
		sous.addActionListener(this);

		quatre.addActionListener(this);
		cinq.addActionListener(this);
		six.addActionListener(this);
		add.addActionListener(this);

		un.addActionListener(this);
		deux.addActionListener(this);
		trois.addActionListener(this);
		total.addActionListener(this);

		zero.addActionListener(this);
		virgule.addActionListener(this);
	}

	public void actionPerformed( ActionEvent e)
	{
		if(e.getSource()== initial)
		{
			op1=0;
			op=0;
			som=0;
			a=0;
			i=0;
			length=number.length();
			number.delete(0,length);
			number.append("0");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== retour)
		{
			length=number.length();
			number.deleteCharAt(length-1);
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()==virgule)
		{
			number.append(".");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== zero)
		{
			number.append("0");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== un)
		{
			number.append("1");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== deux)
		{
			number.append("2");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== trois)
		{
			number.append("3");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== quatre)
		{
			number.append("4");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== cinq)
		{
			number.append("5");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== six)
		{
			number.append("6");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== sept)
		{
			number.append("7");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== huit)
		{
			number.append("8");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== neuf)
		{
			number.append("9");
			n=number.toString();
			t.setText(n);
		}
		if(e.getSource()== add)
		{
			n=number.toString();
			a=Double.parseDouble(n);
			length=number.length();
			number.delete(0,length);
			number.append("");
			op1=1;
			i++;
		}
		if(e.getSource()==sous)
		{
			n=number.toString();
			a=Double.parseDouble(n);
			length=number.length();
			number.delete(0,length);
			number.append("");
			op1=2;
			i++;
		}
		if(e.getSource()==produit)
		{
			n=number.toString();
			a=Double.parseDouble(n);
			length=number.length();
			number.delete(0,length);
			number.append("");
			op1=3;
			i++;
		}
		if(e.getSource()==quotient)
		{
			n=number.toString();
			a=Double.parseDouble(n);
			length=number.length();
			number.delete(0,length);
			number.append("");
			op1=4;
			i++;
		}
		if(e.getSource()==total)
		{
			n=number.toString();
			a=Double.parseDouble(n);
			op1=5;
			i++;
		}
		if(i<=1)
		{
			som=a;
			op=op1;
		}
		if(i>1 && op1!=0)
		{
			switch (op)
			{
				case 1:
				{
					som=som+a;
					t.setText(Double.toString(som));
				}
					break;
				case 2:
				{
					som=som-a;
					t.setText(Double.toString(som));
				}
					break;
				case 3:
				{
					som=som*a;
					t.setText(Double.toString(som));
				}
					break;
				case 4:
				{
					if(a==0)
						t.setText("Error");
					else
					{
						som=som/a;
						t.setText(Double.toString(som));
					}
				}
					break;
				default:
					break;
			}
			op=op1;
			t.setText(Double.toString(som));
			op1=0;
		}
	}

	void addGB(Component component, int x, int y)
	{
		constraints.gridx = x;
		constraints.gridy = y;
		add(component, constraints);
	}
}