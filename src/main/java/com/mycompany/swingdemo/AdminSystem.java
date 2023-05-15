package com.mycompany.swingdemo;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.Scanner;

public class AdminSystem extends javax.swing.JFrame {
    


    public AdminSystem() {
        initComponents();
        invalidFirstName.setVisible(false);
        invalidLastName.setVisible(false);
        invalidEmail.setVisible(false);
        invalidPassword.setVisible(false);
        invalidPassword2.setVisible(false);
        invalidEmailOrPass.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabPane = new javax.swing.JTabbedPane();
        loginPane = new javax.swing.JPanel();
        userEmailLabel = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        userPasswordLabel = new javax.swing.JLabel();
        userPassword = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        projectTitle = new javax.swing.JLabel();
        tabIdentifier = new javax.swing.JLabel();
        invalidEmailOrPass = new javax.swing.JLabel();
        registerPane = new javax.swing.JPanel();
        invalidFirstName = new javax.swing.JLabel();
        projectTitleR = new javax.swing.JLabel();
        tabIdentifierR = new javax.swing.JLabel();
        registerFNameLabel = new javax.swing.JLabel();
        registerLNameLabel = new javax.swing.JLabel();
        registerEmailLabel = new javax.swing.JLabel();
        registerPasswordLabel = new javax.swing.JLabel();
        registerPassword2Label = new javax.swing.JLabel();
        registerPassword = new javax.swing.JPasswordField();
        registerFName = new javax.swing.JTextField();
        registerLName = new javax.swing.JTextField();
        registerEmail = new javax.swing.JTextField();
        registerPassword2 = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        invalidLastName = new javax.swing.JLabel();
        invalidEmail = new javax.swing.JLabel();
        invalidPassword = new javax.swing.JLabel();
        invalidPassword2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin File System");
        setBackground(new java.awt.Color(26, 26, 26));

        TabPane.setBackground(new java.awt.Color(51, 51, 51));
        TabPane.setForeground(new java.awt.Color(255, 255, 255));

        loginPane.setBackground(new java.awt.Color(38, 38, 38));
        loginPane.setForeground(new java.awt.Color(255, 255, 255));

        userEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        userEmailLabel.setLabelFor(userEmail);
        userEmailLabel.setText("Email:");

        userPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        userPasswordLabel.setLabelFor(userPassword);
        userPasswordLabel.setText("Password: ");

        loginButton.setBackground(new java.awt.Color(51, 51, 51));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Log In");
        loginButton.setActionCommand("JButton1");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        projectTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        projectTitle.setForeground(new java.awt.Color(255, 255, 255));
        projectTitle.setText("ADMIN FILE SYSTEM");

        tabIdentifier.setForeground(new java.awt.Color(255, 255, 255));
        tabIdentifier.setText("LOGIN");

        invalidEmailOrPass.setForeground(new java.awt.Color(204, 0, 51));
        invalidEmailOrPass.setText("Invalid Email or Password, enter new email or password");

        javax.swing.GroupLayout loginPaneLayout = new javax.swing.GroupLayout(loginPane);
        loginPane.setLayout(loginPaneLayout);
        loginPaneLayout.setHorizontalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addComponent(userPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addComponent(userEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(projectTitle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPaneLayout.createSequentialGroup()
                            .addGap(215, 215, 215)
                            .addComponent(loginButton)))
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(tabIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(invalidEmailOrPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPaneLayout.setVerticalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(tabIdentifier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(projectTitle)
                .addGap(27, 27, 27)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userEmailLabel)
                    .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidEmailOrPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        TabPane.addTab("Login", loginPane);

        registerPane.setBackground(new java.awt.Color(38, 38, 38));
        registerPane.setForeground(new java.awt.Color(255, 255, 255));

        invalidFirstName.setForeground(new java.awt.Color(204, 0, 0));
        invalidFirstName.setText("first name invalid");

        projectTitleR.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        projectTitleR.setForeground(new java.awt.Color(255, 255, 255));
        projectTitleR.setText("ADMIN FILE SYSTEM");

        tabIdentifierR.setForeground(new java.awt.Color(255, 255, 255));
        tabIdentifierR.setText("REGISTER");

        registerFNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        registerFNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerFNameLabel.setLabelFor(registerFName);
        registerFNameLabel.setText("First name:");

        registerLNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        registerLNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLNameLabel.setLabelFor(registerLName);
        registerLNameLabel.setText("Last name:");
        registerLNameLabel.setName(""); // NOI18N

        registerEmailLabel.setBackground(new java.awt.Color(255, 255, 255));
        registerEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerEmailLabel.setLabelFor(registerEmail);
        registerEmailLabel.setText("Email:");
        registerEmailLabel.setName(""); // NOI18N

        registerPasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
        registerPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerPasswordLabel.setLabelFor(registerPassword);
        registerPasswordLabel.setText("Password:");
        registerPasswordLabel.setName(""); // NOI18N

        registerPassword2Label.setBackground(new java.awt.Color(255, 255, 255));
        registerPassword2Label.setForeground(new java.awt.Color(255, 255, 255));
        registerPassword2Label.setLabelFor(registerPassword2);
        registerPassword2Label.setText("Re-enter Password: ");
        registerPassword2Label.setName(""); // NOI18N

        registerButton.setBackground(new java.awt.Color(51, 51, 51));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setLabel("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        invalidLastName.setForeground(new java.awt.Color(204, 0, 0));
        invalidLastName.setText("last name invalid");

        invalidEmail.setForeground(new java.awt.Color(204, 0, 0));
        invalidEmail.setText("Invalid email address. Please enter a valid email address.");

        invalidPassword.setForeground(new java.awt.Color(204, 0, 0));
        invalidPassword.setText("invalid password");

        invalidPassword2.setForeground(new java.awt.Color(204, 0, 0));
        invalidPassword2.setText("password does not match");

        javax.swing.GroupLayout registerPaneLayout = new javax.swing.GroupLayout(registerPane);
        registerPane.setLayout(registerPaneLayout);
        registerPaneLayout.setHorizontalGroup(
            registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPaneLayout.createSequentialGroup()
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registerPaneLayout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(projectTitleR, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(registerPaneLayout.createSequentialGroup()
                                    .addGap(93, 93, 93)
                                    .addComponent(tabIdentifierR))))
                        .addGroup(registerPaneLayout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(invalidEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(registerPaneLayout.createSequentialGroup()
                                    .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registerPaneLayout.createSequentialGroup()
                                            .addComponent(registerFName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(registerLNameLabel))
                                        .addGroup(registerPaneLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(invalidFirstName)))
                                    .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registerPaneLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(invalidLastName)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                                        .addGroup(registerPaneLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(registerLName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addComponent(registerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(registerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(registerPaneLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerEmailLabel)
                            .addComponent(registerFNameLabel)
                            .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(registerButton)
                                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(registerPaneLayout.createSequentialGroup()
                                        .addComponent(registerPasswordLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(invalidPassword)
                                        .addGap(211, 211, 211))
                                    .addGroup(registerPaneLayout.createSequentialGroup()
                                        .addComponent(registerPassword2Label)
                                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(registerPaneLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(invalidPassword2))
                                            .addGroup(registerPaneLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(registerPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(8, 8, 8)))))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        registerPaneLayout.setVerticalGroup(
            registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tabIdentifierR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(projectTitleR)
                .addGap(33, 33, 33)
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerFNameLabel)
                    .addComponent(registerFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerLNameLabel)
                    .addComponent(registerLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invalidFirstName)
                    .addComponent(invalidLastName))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerEmailLabel)
                    .addComponent(registerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(invalidEmail)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPasswordLabel)
                    .addComponent(registerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPassword2Label)
                    .addComponent(registerPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        registerButton.getAccessibleContext().setAccessibleName("register");

        TabPane.addTab("Register", registerPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String userEmailHolder = userEmail.getText();
        String userPasswordHolder = userPassword.getText();
        boolean isExist = isRecordValid(userEmailHolder, userPasswordHolder);
        if (isExist) {
            javax.swing.JOptionPane.showMessageDialog(loginPane, "Login Successful");
            invalidEmailOrPass.setVisible(false);
        } else {
            javax.swing.JOptionPane.showMessageDialog(loginPane, "Email or password does not exist please try again");
            invalidEmailOrPass.setVisible(true);
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String fName = registerFName.getText();
        String lName = registerLName.getText();
        String email = registerEmail.getText();
        String password = registerPassword.getText();
        String password2 = registerPassword2.getText();
        boolean isValid = isRegistrationValid(fName, lName, email, password, password2);
        boolean isRecordExist = isRecordExist(email);


        if(isValid && !(isRecordExist)){
            try {
                File file = new File("C:\\Users\\Aid\\development\\minidb.txt");
                FileWriter writer = new FileWriter(file, true);
                writer.write( fName + " x " + lName + " x " + email + " x " + password + "\n");
                writer.close();

                readFile(file);
            }catch(Exception e){
                    System.out.println(e);
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(registerPane, "Registration Failed, Please Enter Valid Inputs");
        }
    }

    private boolean isRecordExist(String email){
        try{
            File file = new File("C:\\Users\\Aid\\development\\minidb.txt");
            Scanner lineScanner = new Scanner(file);

            while(lineScanner.hasNextLine()){
                String data = lineScanner.nextLine();
                String[] currRecord = data.split(" x ", 4);
                if(currRecord[2].equals(email)){
                    javax.swing.JOptionPane.showMessageDialog(registerPane, "Record already exist");
                    return true;
                }
            }
            lineScanner.close();
            return false;
        }catch(Exception e){
            System.out.println("File connection fail");
        }
        return false;
    }
    private boolean isRecordValid(String email, String password){
        try{
            File file = new File("C:\\Users\\Aid\\development\\minidb.txt");
            Scanner lineScanner = new Scanner(file);

            while(lineScanner.hasNextLine()){
                String data = lineScanner.nextLine();
                String[] currRecord = data.split(" x ", 4);
                if(currRecord[2].equals(email) && currRecord[3].equals(password)){
                    return true;
                }
            }
            lineScanner.close();
            return false;
        }catch(Exception e){
            System.out.println("File connection fail");
        }
        return false;
    }

    private void readFile(File file){

        try{
            FileReader fr = new FileReader(file);
            int i = 0;
            while((i = fr.read()) != -1){
                System.out.print((char) i);
            }
            fr.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }


    private boolean isRegistrationValid(String firstName, String lastName, String email, String password, String password2) {

        boolean validationOne = isFirstNameValid(firstName);
        boolean validationTwo = isLastNameValid(lastName);
        boolean validationThree = isEmailValid(email);
        boolean validationFour = isPasswordValid(password);
        boolean validationFive = isPasswordMatch(password, password2);

        return validationOne && validationTwo && validationThree && validationFour && validationFive;
    }

    private boolean isFirstNameValid(String firstName) {

        Pattern firstNamePattern = Pattern.compile("^[a-zA-Z]{2,}$");
        Matcher isFNameValid = firstNamePattern.matcher(firstName);

        if(isFNameValid.matches()){
            invalidFirstName.setVisible(false);
            return true;
        }else{
            invalidFirstName.setVisible(true);
            return false;
        }
    }

    private boolean isLastNameValid(String lastName) {
        Pattern lastNamePattern = Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
        Matcher isLNameValid = lastNamePattern.matcher(lastName);

        if(isLNameValid.matches()){
            invalidLastName.setVisible(false);
            return true;
        }else{
            invalidLastName.setVisible(true);
            return false;
        }
    }

    private boolean isEmailValid(String email) {
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher isEmailValid = emailPattern.matcher(email);

        if(isEmailValid.matches()){
            invalidEmail.setVisible(false);
            return true;
        }else{
            invalidEmail.setVisible(true);
            return false;
        }
    }

    private boolean isPasswordValid(String password) {

        Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$");
        Matcher isPasswordValid = passwordPattern.matcher(password);

        if(isPasswordValid.matches()){
            invalidPassword.setVisible(false);
            return true;
        }else{
            invalidPassword.setVisible(true);
            String message = """
            Password should be:
            
            At least 8 characters long
            At least one digit (0-9)
            At least one lowercase letter (a-z)
            At least one uppercase letter (A-Z)
            No whitespace characters
                    """;
            javax.swing.JOptionPane.showMessageDialog(registerPane, message);
            return false;
        }

    }

    private boolean isPasswordMatch(String password1, String password2){
        if(password1.length() == 0 || password2.length() == 0){
            return false;
        }

        if(password1.equals(password2)){
            invalidPassword2.setVisible(false);
            return true;
        }else{
            invalidPassword2.setVisible(true);
            return false;
        }
    }

    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3307/admin_file_system_db";
        String username = "adminfile";
        String password = "zyush712";
        
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection connection = java.sql.DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful");
        } catch (java.sql.SQLException e) {
            System.out.println("Connection failed: " + e);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JTabbedPane TabPane;
    private javax.swing.JLabel invalidEmail;
    private javax.swing.JLabel invalidEmailOrPass;
    private javax.swing.JLabel invalidFirstName;
    private javax.swing.JLabel invalidLastName;
    private javax.swing.JLabel invalidPassword;
    private javax.swing.JLabel invalidPassword2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPane;
    private javax.swing.JLabel projectTitle;
    private javax.swing.JLabel projectTitleR;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField registerEmail;
    private javax.swing.JLabel registerEmailLabel;
    private javax.swing.JTextField registerFName;
    private javax.swing.JLabel registerFNameLabel;
    private javax.swing.JTextField registerLName;
    private javax.swing.JLabel registerLNameLabel;
    private javax.swing.JPanel registerPane;
    private javax.swing.JPasswordField registerPassword;
    private javax.swing.JPasswordField registerPassword2;
    private javax.swing.JLabel registerPassword2Label;
    private javax.swing.JLabel registerPasswordLabel;
    private javax.swing.JLabel tabIdentifier;
    private javax.swing.JLabel tabIdentifierR;
    private javax.swing.JTextField userEmail;
    private javax.swing.JLabel userEmailLabel;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JLabel userPasswordLabel;
    // End of variables declaration//GEN-END:variables
}
