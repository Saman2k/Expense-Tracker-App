Expense Tracker App 
Documentation: 
1. Introduction 
Objective: 
The Expense Tracker App is an Android application developed using Java in Android 
Studio. It helps users to record daily expenses, view them in a list format, and 
automatically calculate the total amount spent. The app provides a simple and user
friendly interface for managing personal expenses.

3. Tools and Technologies Used Android:
This step is important because it: 
 Android Studio 
 Java Programming Language 
 XML (User Interface Design) 
 ListView 
 ArrayList 
 Adapter (Custom Adapter) 
 CardView

5. Step-by-Step Project Development: 
Step 1:  Creating New Project 
 Open Android Studio 
 Click on “New Project” 
 Select “Empty Views Activity” 
 Click Next 
 Enter project name: ExpenseTracker 
 Select Language: Java 
 Click Finish

Step 2: Project Structure Setup 
After project creation, the following structure is available: 
 MainActivity.java (default activity) 
 res → layout → activity_main.xml 
 manifests → AndroidManifest.xml
Step 3: Adding Card View Dependency 
 Open Gradle Scripts 
 Open build.gradle (Module: app) 
 Inside dependencies block, add: 
 implementation 'androidx.cardview:cardview:1.0.0' 
 Click “Sync Now” 
 Wait for Gradle sync to complete 

Step 4: Designing Main Screen (UI) 
 Open res → layout → activity_main.xml 
 Delete default ConstraintLayout code 
 Replace with LinearLayout design 
 Add the following UI components: 
 EditText for Expense Title 
 EditText for Amount 
 Button to Add Expense 
 TextView to show Total 
 ListView to display expenses 
 Save the file 

Step 5: Creating Expense Class 
 Go to package folder under java 
 Right-click on package name 
 Select New → Java Class 
 Name it: Expense 
Add variables: 
 String title 
 double amount 
Create constructor and getter methods 
Save the file 

Step 6: Creating Custom Adapter 
This step is important because it: 
 Right-click package name 
 Right-click package name 
 Select New → Java Class 
 Name it: ExpenseAdapter 
 Extend ArrayAdapter class 
 Override getView method 
 Inflate custom layout item_expense.xml 
 Bind title and amount to TextView 
 Save file

Step 7: Creating Item Layout 
 Go to res → layout 
 Right-click → New → Layout Resource File 
 Name: item_expense 
 Replace default code with TextView design 
 Save file 
 
Step 7: Writing Main Logic (MainActivity.java) 
 Open MainActivity.java 
 Declare UI components: 
 EditText (title, amount) 
 Button (add expense) 
 TextView (total) 
 ListView 
 Create ArrayList for storing expenses 
 Initialize adapter 
 Set adapter to ListView 
 Add button click functionality: 
 Get input values 
 Validate input 
 Add expense to list 
 Update total 
 Refresh ListView 
 Add long press delete functionality: 
 Remove item 
 Update total 
 Refresh list

Step 8: Running the Application 
 Click Run button in Android Studio 
 Select emulator or physical device 
 Wait for app to build 
 App launches on mobile/emulator 
 Test by adding expenses 

Step 9: Generating APK 
 Go to top menu “Build” 
 Click “Generate APKs” 
 Select “Build APK” 
 Wait for build completion 
 Click “Locate” 
 APK file appears in: 
 app → build → outputs → apk → debug 
 Install APK on mobile device 

4. Features of the App 
 Add expense title and amount 
 Display list of expenses 
 Auto calculation of total 
 Delete expense by long press 
 Simple and clean UI

6. Advantages 
 Easy to use 
 Helps manage daily expenses 
 Provides instant total calculation 
 Lightweight application

8. Future Improvements 
 Add SQLite database for saving data permanently 
 Add categories (Food, Travel, Bills, etc.) 
 Add graphs and charts 
 Add login system 
 Improve UI with modern design
 
10. Conclusion 
The Expense Tracker App is a simple Android application developed using Java and Android 
Studio. It successfully demonstrates basic Android development concepts such as UI design, 
event handling, custom adapters, and list management. The app helps users track expenses 
efficiently and can be further improved into a more advanced financial management system.
