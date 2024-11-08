/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.event.*;

public class castingvote extends javax.swing.JFrame {

    // Constructor for the dashboard
    public castingvote() {
        initComponents();
    }

    // Initialize the components
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("                    Online Voting Machine");

        jButton1.setText("Register Vote");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Poll");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Casting Vote");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Search Result");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(606, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(30, 30, 30)
                .addComponent(jButton4)
                .addGap(0, 130, Short.MAX_VALUE))
        );

        pack();
    }

    // Action handler for "Register Vote" button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Register Vote functionality is not implemented yet.");
    }

    // Action handler for "Create Poll" button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Create Poll functionality is not implemented yet.");
    }

    // Action handler for "Casting Vote" button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Open the "Casting Vote" window when the button is clicked
        new VotingWindow().setVisible(true);
    }

    // Action handler for "Search Result" button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Search Result functionality is not implemented yet.");
    }

    // Define the "Casting Vote" window class
    private class VotingWindow extends JFrame {
        private JComboBox<String> candidateList;
        private JButton castVoteButton;

        public VotingWindow() {
            setTitle("Casting Vote");
            setSize(300, 200);
            setLocationRelativeTo(null); // Center the window

            // Create a list of candidates for voting
            String[] candidates = {"Candidate 1", "Candidate 2", "Candidate 3", "Candidate 4"};
            candidateList = new JComboBox<>(candidates);
            castVoteButton = new JButton("Cast Vote");

            // Action when "Cast Vote" button is clicked
            castVoteButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String selectedCandidate = (String) candidateList.getSelectedItem();
                    JOptionPane.showMessageDialog(null, "You have cast your vote for " + selectedCandidate);
                    dispose(); // Close the vote casting window
                }
            });

            // Layout setup
            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
            add(new JLabel("Select a Candidate to Vote:"));
            add(candidateList);
            add(castVoteButton);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
