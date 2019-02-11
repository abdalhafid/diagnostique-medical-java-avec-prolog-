import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;
import org.jpl7.Query;
public class Diagnostique {
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		f.setSize(700,380);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setTitle("TP de System expert (mini projet)");
		f.setVisible(true);
		
		final ArrayList symptomes = new ArrayList();
		
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));
		
		
		
		final JPanel symptomPane = new JPanel();
		symptomPane.setBorder(BorderFactory.createTitledBorder("Choisez le partie de corps puis les symptomes"));
		symptomPane.setLayout(new BoxLayout(symptomPane, BoxLayout.Y_AXIS));
		
		final JButton btn = new JButton("validez");
		final JButton reset = new JButton("Vider");
		final JCheckBox symptom1 = new JCheckBox("Baisse de vision brutal");
		final JCheckBox symptom2 = new JCheckBox("OEil rouge");
		final JCheckBox symptom3 = new JCheckBox("OEil qui pleur");
		final JCheckBox symptom4 = new JCheckBox("Avoir l\'impression d\'avoir du sable dans les yeux");
		final JCheckBox symptom5 = new JCheckBox("Baisse de vision légère");
		final JCheckBox symptom6 = new JCheckBox("Non œil rouge");
		final JCheckBox symptom7 = new JCheckBox("Température<38");
		final JCheckBox symptom8 = new JCheckBox("Mal au yeux");
		final JCheckBox symptom9 = new JCheckBox("Douleur oculaire modéré");
		final JCheckBox symptom10 = new JCheckBox("Douleur lorsque l'œil bouge");
		final JCheckBox symptom11 = new JCheckBox("Mal de tête");
		final JCheckBox symptom12 = new JCheckBox("Non fièvre");
		final JCheckBox symptom13 = new JCheckBox("Maux de tête apparus brutaiement");
		final JCheckBox symptom14 = new JCheckBox("Maux de tête d\'un seul côté");
		final JCheckBox symptom15 = new JCheckBox("Vomissement");
		final JCheckBox symptom16 = new JCheckBox("Ecoulement au niveau de l\'oreille");
		final JCheckBox symptom17 = new JCheckBox("Démangeaison au niveau de l\'oreille");
		final JCheckBox symptom18 = new JCheckBox("Mal dans poitrine");
		final JCheckBox symptom19 = new JCheckBox("Mal à la gorge");
		final JCheckBox symptom20 = new JCheckBox("Toux");
		final JCheckBox symptom21 = new JCheckBox("Fatigue");
		final JCheckBox symptom22 = new JCheckBox("Fièvre");
		final JComboBox zone= new JComboBox();
		zone.addItem("Yeux");
		zone.addItem("Tête");
		zone.addItem("Corps");
		zone.addItem("Oreille");
		symptomPane.add(zone);
		symptomPane.add(symptom1);
		symptomPane.add(symptom2);
		symptomPane.add(symptom3);
		symptomPane.add(symptom4);
		symptomPane.add(symptom5);
		symptomPane.add(symptom6);
		symptomPane.add(symptom7);
		symptomPane.add(symptom8);
		symptomPane.add(symptom9);
		symptomPane.add(symptom10);
		/*symptomPane.add(symptom11);
		symptomPane.add(symptom12);
		symptomPane.add(symptom13);
		symptomPane.add(symptom14);
		symptomPane.add(symptom15);
		symptomPane.add(symptom16);
		symptomPane.add(symptom17);
		symptomPane.add(symptom18);
		symptomPane.add(symptom19);
		symptomPane.add(symptom20);
		symptomPane.add(symptom21);
		symptomPane.add(symptom22);*/
		
		symptomPane.add(btn);
		symptomPane.add(reset);
		JPanel diagnoPane = new JPanel();
		//diagnoPane.setBorder(BorderFactory.createTitledBorder("Votre diagnostique: "));
		diagnoPane.setLayout(new BorderLayout());
		final JLabel diagnoLab = new JLabel("Choisir 7 symptom ou moin pour le diagnostique");
		diagnoPane.add(diagnoLab);
		
		mainPane.add(symptomPane);
		mainPane.add(diagnoPane);
		diagnoPane.removeAll();
		diagnoPane.revalidate();
		f.add(mainPane);
		f.revalidate();
		
		zone.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ev){
				symptomPane.removeAll();
				symptomPane.add(zone);
				if(zone.getSelectedItem().equals("Yeux"))
				{
					symptomPane.add(symptom1);
					symptomPane.add(symptom2);
					symptomPane.add(symptom3);
					symptomPane.add(symptom4);
					symptomPane.add(symptom5);
					symptomPane.add(symptom6);
					symptomPane.add(symptom7);
					symptomPane.add(symptom8);
					symptomPane.add(symptom9);
					symptomPane.add(symptom10);
				}else if(zone.getSelectedItem().equals("Tête")){
					symptomPane.add(symptom11);
					symptomPane.add(symptom12);
					symptomPane.add(symptom13);
					symptomPane.add(symptom14);
					symptomPane.add(symptom15);
				}else if(zone.getSelectedItem().equals("Oreille"))
				{
					symptomPane.add(symptom16);
					symptomPane.add(symptom17);
				}else if(zone.getSelectedItem().equals("Corps"))
				{
					symptomPane.add(symptom11);
					symptomPane.add(symptom18);
					symptomPane.add(symptom19);
					symptomPane.add(symptom20);
					symptomPane.add(symptom21);
					symptomPane.add(symptom22);
				}
				symptomPane.add(btn);
				symptomPane.add(reset);
				symptomPane.revalidate();
			}
		});
		
		
		symptom1.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom1.isSelected())
				{
					symptomes.add("Baisse de vision brutal");
				}else
				{
					symptomes.remove(symptomes.indexOf(symptom1.getText()));
				}
			}
			
		});
		
		symptom2.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom2.isSelected())
				{
					symptomes.add("OEil rouge");
				}else
				{
					symptomes.remove("OEil rouge");
				}
			}
			
		});
		
		symptom3.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom3.isSelected())
				{
					symptomes.add("OEil qui pleur");
				}else
				{
					symptomes.remove("OEil qui pleur");
				}
			}
			
		});
		
		symptom4.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom4.isSelected())
				{
					symptomes.add("Avoir limpression davoir du sable dans les yeux");
				}else
				{
					symptomes.remove("Avoir limpression davoir du sable dans les yeux");
				}
			}
			
		});
		
		symptom5.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom5.isSelected())
				{
					symptomes.add("Baisse de vision legere");
				}else
				{
					symptomes.remove("Baisse de vision legere");
				}
			}
			
		});
		symptom6.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom6.isSelected())
				{
					symptomes.add("Non oeil rouge");
				}else
				{
					symptomes.remove("Non oeil rouge");
				}
			}
			
		});
		
		symptom7.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom7.isSelected())
				{
					symptomes.add("Temperature<38");
				}else
				{
					symptomes.remove("Temperature<38");
				}
			}
			
		});
	
		symptom8.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom8.isSelected())
				{
					symptomes.add("Mal au yeux");
				}else
				{
					symptomes.remove("Mal au yeux");
				}
			}
			
		});
		
		symptom9.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom9.isSelected())
				{
					symptomes.add("Douleur oculaire modere");
				}else
				{
					symptomes.remove("Douleur oculaire modere");
				}
			}
			
		});
		
		symptom10.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom10.isSelected())
				{
					symptomes.add("Douleur lorsque loeil bouge");
				}else
				{
					symptomes.remove("Douleur lorsque loeil bouge");
				}
			}
			
		});
		
		symptom11.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom11.isSelected())
				{
					symptomes.add("Mal de tete");
				}else
				{
					symptomes.remove("Mal de tete");
				}
			}
			
		});
		
		symptom12.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom12.isSelected())
				{
					symptomes.add("Non fievre");
				}else
				{
					symptomes.remove("Non fievre");
				}
			}
			
		});
		
		symptom13.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom13.isSelected())
				{
					symptomes.add("Maux de tete apparus brutaiement");
				}else
				{
					symptomes.remove("Maux de tete apparus brutaiement");
				}
			}
			
		});
		
		symptom14.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom14.isSelected())
				{
					symptomes.add("Maux de tete dun seul cote");
				}else
				{
					symptomes.remove("Maux de tete dun seul cote");
				}
			}
			
		});
		
		symptom15.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom15.isSelected())
				{
					symptomes.add("Vomissement");
				}else
				{
					symptomes.remove("Vomissement");
				}
			}
			
		});
		
		symptom16.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom16.isSelected())
				{
					symptomes.add("Ecoulement au niveau de loreille");
				}else
				{
					symptomes.remove("Ecoulement au niveau de loreille");
				}
			}
			
		});
		
		symptom17.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom17.isSelected())
				{
					symptomes.add("Demangeeaison au niveau de loreille");
				}else
				{
					symptomes.remove("Demangeeaison au niveau de loreille");
				}
			}
			
		});
		
		symptom18.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom18.isSelected())
				{
					symptomes.add("Mal dans poitrine");
				}else
				{
					symptomes.remove("Mal dans poitrine");
				}
			}
			
		});
		
		symptom19.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom19.isSelected())
				{
					symptomes.add("Mal a la gorge");
				}else
				{
					symptomes.remove("Mal a la gorge");
				}
			}
			
		});
		
		symptom20.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom20.isSelected())
				{
					symptomes.add("Toux");
				}else
				{
					symptomes.remove("Toux");
				}
			}
			
		});
		
		symptom21.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom21.isSelected())
				{
					symptomes.add("Fatigue");
				}else
				{
					symptomes.remove("Fatigue");
				}
			}
			
		});
		
		symptom22.addItemListener(new ItemListener(){
			
			public void itemStateChanged(ItemEvent ev){
				if(symptom22.isSelected())
				{
					symptomes.add("Fievre");
				}else
				{
					symptomes.remove("Fievre");
				}
			}
			
		});
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev)
			{
				if(symptom1.isSelected())
				{
					symptom1.setSelected(false);
				}
				
				if(symptom2.isSelected())
				{
					symptom2.setSelected(false);
				}
				
				if(symptom3.isSelected())
				{
					symptom3.setSelected(false);
				}
				
				if(symptom4.isSelected())
				{
					symptom4.setSelected(false);
				}
				
				if(symptom5.isSelected())
				{
					symptom5.setSelected(false);
				}
				
				if(symptom6.isSelected())
				{
					symptom6.setSelected(false);
				}
				
				if(symptom7.isSelected())
				{
					symptom7.setSelected(false);
				}
				
				if(symptom8.isSelected())
				{
					symptom8.setSelected(false);
				}
				
				if(symptom9.isSelected())
				{
					symptom9.setSelected(false);
				}
				
				if(symptom10.isSelected())
				{
					symptom10.setSelected(false);
				}
				
				if(symptom11.isSelected())
				{
					symptom11.setSelected(false);
				}
				
				if(symptom12.isSelected())
				{
					symptom12.setSelected(false);
				}
				
				if(symptom13.isSelected())
				{
					symptom13.setSelected(false);
				}
				
				if(symptom14.isSelected())
				{
					symptom14.setSelected(false);
				}
				
				if(symptom15.isSelected())
				{
					symptom15.setSelected(false);
				}
				
				if(symptom16.isSelected())
				{
					symptom16.setSelected(false);
				}
				
				if(symptom17.isSelected())
				{
					symptom17.setSelected(false);
				}
				
				if(symptom18.isSelected())
				{
					symptom18.setSelected(false);
				}
				
				if(symptom19.isSelected())
				{
					symptom19.setSelected(false);
				}
				
				if(symptom20.isSelected())
				{
					symptom20.setSelected(false);
				}
				
				if(symptom21.isSelected())
				{
					symptom21.setSelected(false);
				}
				
				if(symptom22.isSelected())
				{
					symptom22.setSelected(false);
				}
				
				symptomes.clear();
			}
		});
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev)
			{
				Query q1 = new Query("consult('medical.pl')");
				q1.hasSolution();
				String diagno = "";
				
				/*if(symptom1.isSelected())
				{
					symptomes.add(symptom1.getText());
				}
				
				if(symptom2.isSelected())
				{
					symptomes.add(symptom2.getText());
				}
				
				if(symptom3.isSelected())
				{
					symptomes.add(symptom3.getText());
				}
				
				if(symptom4.isSelected())
				{
					symptomes.add(symptom4.getText());
				}
				
				if(symptom5.isSelected())
				{
					symptomes.add(symptom5.getText());
				}
				
				if(symptom6.isSelected())
				{
					symptomes.add(symptom6.getText());
				}
				
				if(symptom7.isSelected())
				{
					symptomes.add(symptom7.getText());
				}
				
				if(symptom8.isSelected())
				{
					symptomes.add(symptom8.getText());
				}
				
				if(symptom9.isSelected())
				{
					symptomes.add(symptom9.getText());
				}
				
				if(symptom10.isSelected())
				{
					symptomes.add(symptom10.getText());
				}
				
				if(symptom11.isSelected())
				{
					symptomes.add(symptom11.getText());
				}
				
				if(symptom12.isSelected())
				{
					symptomes.add(symptom12.getText());
				}
				
				if(symptom13.isSelected())
				{
					symptomes.add(symptom13.getText());
				}
				
				if(symptom14.isSelected())
				{
					symptomes.add(symptom14.getText());
				}
				
				if(symptom15.isSelected())
				{
					symptomes.add(symptom15.getText());
				}
				
				if(symptom16.isSelected())
				{
					symptomes.add(symptom16.getText());
				}
				
				if(symptom17.isSelected())
				{
					symptomes.add(symptom17.getText());
				}
				
				if(symptom18.isSelected())
				{
					symptomes.add(symptom18.getText());
				}
				
				if(symptom19.isSelected())
				{
					symptomes.add(symptom19.getText());
				}
				
				if(symptom20.isSelected())
				{
					symptomes.add(symptom1.getText());
				}
				
				if(symptom21.isSelected())
				{
					symptomes.add(symptom21.getText());
				}
				
				if(symptom22.isSelected())
				{
					symptomes.add(symptom22.getText());
				}*/
				
				
				if(symptomes.size() >7)
				{
					JOptionPane.showMessageDialog(null, "vous avez déppasser 7 symptomes, SVP choisez 7 symptomes en maximum");
				}else if(symptomes.size() < 2)
				{
					JOptionPane.showMessageDialog(null, "SVP choisez 2 symptomes en minimum");
				}else if(symptomes.size() ==2)
				{
					diagno = "diagnostique_de('"+symptomes.get(0)+"','"+symptomes.get(1)+"', 'Vide','Vide','Vide','Vide','Vide',D).";
				}else if(symptomes.size() ==3)
				{
					diagno = "diagnostique_de('"+symptomes.get(0)+"','"+symptomes.get(1)+"', '"+symptomes.get(2)+"','Vide','Vide','Vide','Vide',D).";
				}else if(symptomes.size() ==4)
				{
					diagno = "diagnostique_de('"+symptomes.get(0)+"','"+symptomes.get(1)+"', '"+symptomes.get(2)+"','"+symptomes.get(3)+"','Vide','Vide','Vide',D).";
				}else if(symptomes.size() ==5)
				{
					diagno = "diagnostique_de('"+symptomes.get(0)+"','"+symptomes.get(1)+"', '"+symptomes.get(2)+"','"+symptomes.get(3)+"','"+symptomes.get(4)+"','Vide','Vide',D).";
				}else if(symptomes.size() ==6)
				{
					diagno = "diagnostique_de('"+symptomes.get(0)+"','"+symptomes.get(1)+"', '"+symptomes.get(2)+"','"+symptomes.get(3)+"','"+symptomes.get(4)+"','"+symptomes.get(5)+"','Vide',D).";
				}else if(symptomes.size() ==7)
				{
					diagno = "diagnostique_de('"+symptomes.get(0)+"','"+symptomes.get(1)+"', '"+symptomes.get(2)+"','"+symptomes.get(3)+"','"+symptomes.get(4)+"','"+symptomes.get(5)+"','"+symptomes.get(6)+"',D).";
				}
				if(symptomes.size()<=7 && symptomes.size()>=2)
				{
					Query q2 = new Query(diagno);
					q2.hasSolution();
					Font font = new Font("Serif",Font.ITALIC, 16);
					diagnoLab.setFont(font);
					int n=0;
					while(q2.hasMoreSolutions()) n++;
					if(n==0)
					{
						diagnoLab.setText(" Votre maladie  n'exist pas dans notre base de connaissance");
						JOptionPane.showMessageDialog(null, " Votre maladie  n'exist pas dans notre base de connaissance");
					}else
					{
						while(q2.hasMoreSolutions())
						{diagnoLab.setText(" Votre diagnostique est: "+ q2.nextSolution().get("D"));JOptionPane.showMessageDialog(null, " Votre diagnostique est: "+ q2.nextSolution().get("D"));}
					}
				}
					
			}
			
		});
	}
}
