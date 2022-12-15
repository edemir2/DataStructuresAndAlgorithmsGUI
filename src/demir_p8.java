import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;

public class demir_p8 {

	
	
	private static int[] sortValues;
	private static int[] searchValues;
	private static int[] sortedValues;
	private static int[] sortedValues1;
	
	private static java.util.TreeSet<Integer> treeSetValues = new java.util.TreeSet<>();
	private static java.util.HashSet<Integer> hashSetValues = new java.util.HashSet<>();
	private static java.util.PriorityQueue<Integer> priorityQueueValues = new java.util.PriorityQueue<>();
	private static java.util.ArrayList<Integer> arrayListValues = new java.util.ArrayList<>();
	private static java.util.ArrayList<Integer> sortedArrayListValues = new java.util.ArrayList<>();
	private static BinarySearchTree bst = new BinarySearchTree();
	private static int[] unsortedValues;
	
	private static javax.swing.JButton sortIntsButton;
	private static javax.swing.JButton mergeSortButton;
	private static javax.swing.JButton addToBstButton;
	private static javax.swing.JButton addToTreeSetButton;
	private static javax.swing.JButton addToPriorityQueueButton;
	private static javax.swing.JButton addToHashSetButton;
	private static javax.swing.JButton addToArrayListButton;
	private static javax.swing.JButton addToSortedArrayListButton;
	private static javax.swing.JButton addToArrayButton;
	
	
	 
	private static javax.swing.JLabel sortIntsLabel;
	private static javax.swing.JLabel mergeSortLabel;
	private static javax.swing.JLabel addToBstLabel;
	private static javax.swing.JLabel addToTreeSetLabel;
	private static javax.swing.JLabel addToPriorityQueueLabel;
	private static javax.swing.JLabel addToHashSetLabel;
	private static javax.swing.JLabel addToArrayListLabel;
	private static javax.swing.JLabel addToSortedArrayListLabel;
	private static javax.swing.JLabel addToArrayLabel;
	
	
	private static javax.swing.JButton searchSortedIntsButton;
	private static javax.swing.JButton searchMergeSortButton;
	private static javax.swing.JButton searchBstButton;
	private static javax.swing.JButton searchTreeSetButton;
	private static javax.swing.JButton searchPriorityQueueButton;
	private static javax.swing.JButton searchHashSetButton;
	private static javax.swing.JButton searchArrayListButton;
	private static javax.swing.JButton searchSortedArrayListButton;
	private static javax.swing.JButton searchArrayButton;
	 
	private static javax.swing.JLabel searchSortedIntsLabel;
	private static javax.swing.JLabel searchMergeSortLabel;
	private static javax.swing.JLabel searchBstLabel;
	private static javax.swing.JLabel searchTreeSetLabel;
	private static javax.swing.JLabel searchPriorityQueueLabel;
	private static javax.swing.JLabel searchHashSetLabel;
	private static javax.swing.JLabel searchArrayListLabel;
	private static javax.swing.JLabel searchSortedArrayListLabel;
	private static javax.swing.JLabel searchArrayLabel;
	
	private static int width = 700;
	private static int height = 350;
	
	
	public static void main(String[] args)
	
	{
		
		
		readData(args[0]);
		readData(args[1]);
		//selectionSort(sortValues,0,sortValues.length); //Index 1000 out of bounds for length 1000
		
		// create the window and specify the size and what to do when the window is closed
		javax.swing.JFrame f = new javax.swing.JFrame();
		f.setPreferredSize(new java.awt.Dimension(width, height));
		//f.setMaximumSize(new java.awt.Dimension(width, height));
		f.setMinimumSize(new java.awt.Dimension(width, height));
		f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		
		javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar(); 

		
		javax.swing.JMenu fileMenu = new javax.swing.JMenu("File");
		javax.swing.JMenuItem fileReadSort = new javax.swing.JMenuItem("Read sort file");
		javax.swing.JMenuItem fileReadSearch = new javax.swing.JMenuItem("Read search file");
		javax.swing.JMenuItem fileExit = new javax.swing.JMenuItem("Exit");
		
		
		MenuItemActionListener fileReadSortActionItemListener = new MenuItemActionListener(fileReadSort);
		MenuItemActionListener fileReadSearchActionItemListener = new MenuItemActionListener(fileReadSearch);
		MenuItemActionListener fileExitActionItemListener = new MenuItemActionListener(fileExit);
		
		
		fileReadSort.addActionListener(fileReadSortActionItemListener);
		fileReadSearch.addActionListener(fileReadSearchActionItemListener);
		fileExit.addActionListener(fileExitActionItemListener);

		
		menuBar.add(fileMenu);
		fileMenu.add(fileReadSort);
		fileMenu.add(fileReadSearch);
		fileMenu.add(fileExit);
		
		
		javax.swing.JPanel leftButtonPanel = new javax.swing.JPanel();
		leftButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0,255), 2));
		java.awt.GridBagLayout leftButtonGridBagLayout = new java.awt.GridBagLayout();
		leftButtonPanel.setLayout(leftButtonGridBagLayout);
		leftButtonPanel.setPreferredSize(new java.awt.Dimension(330, 350));
		leftButtonPanel.setMinimumSize(new java.awt.Dimension(330, 350));
		java.awt.GridBagConstraints leftButtonPanelConstraints = new java.awt.GridBagConstraints();
		
		

		
		
		sortIntsButton = new javax.swing.JButton("sort ints");
		sortIntsLabel = new javax.swing.JLabel("no result");
		mergeSortButton = new javax.swing.JButton("merge sort ints");
		mergeSortLabel = new javax.swing.JLabel("no result");
		addToBstButton = new javax.swing.JButton("add to bst");
		addToBstLabel = new javax.swing.JLabel("no result");
		addToTreeSetButton = new javax.swing.JButton("add to treeset");
		addToTreeSetLabel = new javax.swing.JLabel("no result");
		addToPriorityQueueButton = new javax.swing.JButton("add to priority queue");
		addToPriorityQueueLabel = new javax.swing.JLabel("no result");
		addToHashSetButton = new javax.swing.JButton("add to hash set");
		addToHashSetLabel = new javax.swing.JLabel("no result");
		addToArrayListButton = new javax.swing.JButton("add to array list");
		addToArrayListLabel = new javax.swing.JLabel("no result");
		addToSortedArrayListButton = new javax.swing.JButton("add to sorted array list");
		addToSortedArrayListLabel = new javax.swing.JLabel("no result");
		addToArrayButton = new javax.swing.JButton("add to array");
		addToArrayLabel = new javax.swing.JLabel("no result");
		
		
		
		
		ButtonActionListener sortIntsButtonActionListener = new ButtonActionListener(sortIntsButton);
		ButtonActionListener mergeSortButtonActionListener = new ButtonActionListener(mergeSortButton);    //qqqqqqqqqqqqqqqqqqqqqqqq
		ButtonActionListener addToBstButtonActionListener = new ButtonActionListener(addToBstButton);
		ButtonActionListener addToTreeSetButtonActionListener = new ButtonActionListener(addToTreeSetButton);
		ButtonActionListener addToPriorityQueueButtonActionListener = new ButtonActionListener(addToPriorityQueueButton);
		ButtonActionListener addToHashSetButtonActionListener = new ButtonActionListener(addToHashSetButton);
		ButtonActionListener addToArrayListButtonActionListener = new ButtonActionListener(addToArrayListButton);
		ButtonActionListener addToSortedArrayListButtonActionListener = new ButtonActionListener(addToSortedArrayListButton);
		ButtonActionListener addToArrayButtonActionListener = new ButtonActionListener(addToArrayButton);
		
		sortIntsButton.addActionListener(sortIntsButtonActionListener);
		mergeSortButton.addActionListener(mergeSortButtonActionListener);
		addToBstButton.addActionListener(addToBstButtonActionListener);
		addToTreeSetButton.addActionListener(addToTreeSetButtonActionListener);
		addToPriorityQueueButton.addActionListener(addToPriorityQueueButtonActionListener);
		addToHashSetButton.addActionListener(addToHashSetButtonActionListener);
		addToArrayListButton.addActionListener(addToArrayListButtonActionListener);
		addToSortedArrayListButton.addActionListener(addToSortedArrayListButtonActionListener);
		addToArrayButton.addActionListener(addToArrayButtonActionListener);
		
		
		leftButtonPanelConstraints.weightx = 1;
		leftButtonPanelConstraints.weighty = 1;
		leftButtonPanelConstraints.fill = java.awt.GridBagConstraints.NONE;
		leftButtonPanelConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
		
		//------------------------------------------------------------------------------------

		
		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 0;
		leftButtonPanelConstraints.gridwidth = 1;
		leftButtonGridBagLayout.setConstraints(sortIntsButton, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 0;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftButtonGridBagLayout.setConstraints(sortIntsLabel, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 1;
		leftButtonPanelConstraints.gridwidth = 1;
		leftButtonGridBagLayout.setConstraints(addToBstButton, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 1;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftButtonGridBagLayout.setConstraints(addToBstLabel, leftButtonPanelConstraints);
		
		//------------------------------------------------------------------------------------
		
		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 2;
		leftButtonPanelConstraints.gridwidth = 1;
		leftButtonGridBagLayout.setConstraints(addToTreeSetButton, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 2;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftButtonGridBagLayout.setConstraints(addToTreeSetLabel, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 3;
		leftButtonPanelConstraints.gridwidth = 1;
		leftButtonGridBagLayout.setConstraints(addToPriorityQueueButton, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 3;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftButtonGridBagLayout.setConstraints(addToPriorityQueueLabel, leftButtonPanelConstraints);
		
		//------------------------------------------------------------------------------------

		
		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 4;
		leftButtonPanelConstraints.gridwidth = 1;
		leftButtonGridBagLayout.setConstraints(addToHashSetButton, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 4;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftButtonGridBagLayout.setConstraints(addToHashSetLabel, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 5;
		leftButtonPanelConstraints.gridwidth = 1;
		leftButtonGridBagLayout.setConstraints(addToArrayListButton, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 5;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftButtonGridBagLayout.setConstraints(addToArrayListLabel, leftButtonPanelConstraints);
		
		//------------------------------------------------------------------------------------

		
		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 6;
		leftButtonPanelConstraints.gridwidth = 1;
		leftButtonGridBagLayout.setConstraints(addToSortedArrayListButton, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 6;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftButtonGridBagLayout.setConstraints(addToSortedArrayListLabel, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 7;
		leftButtonPanelConstraints.gridwidth = 1;
		leftButtonGridBagLayout.setConstraints(addToArrayButton, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 7;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftButtonGridBagLayout.setConstraints(addToArrayLabel, leftButtonPanelConstraints);
		

		leftButtonPanelConstraints.gridx = 0;
		leftButtonPanelConstraints.gridy = 8;
		leftButtonPanelConstraints.gridwidth = 1;
		leftButtonGridBagLayout.setConstraints(mergeSortButton, leftButtonPanelConstraints);
		
		leftButtonPanelConstraints.gridx = 1;
		leftButtonPanelConstraints.gridy = 8;
		leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		leftButtonGridBagLayout.setConstraints(mergeSortLabel, leftButtonPanelConstraints);
		
		
		
	
		leftButtonPanel.add(sortIntsButton);
		leftButtonPanel.add(mergeSortButton);
		leftButtonPanel.add(addToBstButton);
		leftButtonPanel.add(addToTreeSetButton);
		leftButtonPanel.add(addToPriorityQueueButton);
		leftButtonPanel.add(addToHashSetButton);
		leftButtonPanel.add(addToArrayListButton);
		leftButtonPanel.add(addToSortedArrayListButton);
		leftButtonPanel.add(addToArrayButton);
		leftButtonPanel.add(sortIntsLabel);
		leftButtonPanel.add(mergeSortLabel);
		leftButtonPanel.add(addToBstLabel);
		leftButtonPanel.add(addToTreeSetLabel);
		leftButtonPanel.add(addToPriorityQueueLabel);
		leftButtonPanel.add(addToHashSetLabel);
		leftButtonPanel.add(addToArrayListLabel);
		leftButtonPanel.add(addToSortedArrayListLabel);
		leftButtonPanel.add(addToArrayLabel);
		
		
		javax.swing.JPanel rightButtonPanel = new javax.swing.JPanel();
		rightButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0,255), 2));
		java.awt.GridBagLayout rightButtonGridBagLayout = new java.awt.GridBagLayout();
		rightButtonPanel.setLayout(rightButtonGridBagLayout);
		rightButtonPanel.setPreferredSize(new java.awt.Dimension(330, 350));
		rightButtonPanel.setMinimumSize(new java.awt.Dimension(330, 350));
		java.awt.GridBagConstraints rightButtonPanelConstraints = new java.awt.GridBagConstraints();
		
		searchSortedIntsButton = new javax.swing.JButton("search sorted ints");
		searchSortedIntsLabel = new javax.swing.JLabel("no result");
		searchMergeSortButton = new javax.swing.JButton("search merge sorted ints");
		searchMergeSortLabel = new javax.swing.JLabel("no result");
		searchBstButton = new javax.swing.JButton("search bst");
		searchBstLabel = new javax.swing.JLabel("no result");
		searchTreeSetButton = new javax.swing.JButton("search treeset");
		searchTreeSetLabel = new javax.swing.JLabel("no result");
		searchPriorityQueueButton = new javax.swing.JButton("search priority queue");
		searchPriorityQueueLabel = new javax.swing.JLabel("no result");
		searchHashSetButton = new javax.swing.JButton("search hash set");
		searchHashSetLabel = new javax.swing.JLabel("no result");
		searchArrayListButton = new javax.swing.JButton("search array list");
	 	searchArrayListLabel = new javax.swing.JLabel("no result");
	 	searchSortedArrayListButton = new javax.swing.JButton("search sorted array list");
	 	searchSortedArrayListLabel = new javax.swing.JLabel("no result");
	 	searchArrayButton = new javax.swing.JButton("search array");
	 	searchArrayLabel = new javax.swing.JLabel("no result");
		 

	 	
		ButtonActionListener searchSortedIntsButtonActionListener = new ButtonActionListener(searchSortedIntsButton);
		ButtonActionListener searchMergeSortButtonActionListener = new ButtonActionListener(searchMergeSortButton);
		ButtonActionListener searchBstButtonActionListener = new ButtonActionListener(searchBstButton);
		ButtonActionListener searchTreeSetButtonActionListener = new ButtonActionListener(searchTreeSetButton);
		ButtonActionListener searchPriorityQueueButtonActionListener = new ButtonActionListener(searchPriorityQueueButton);
		ButtonActionListener searchHashSetButtonActionListener = new ButtonActionListener(searchHashSetButton);
		ButtonActionListener searchArrayListButtonActionListener = new ButtonActionListener(searchArrayListButton);
		ButtonActionListener searchSortedArrayListButtonActionListener = new ButtonActionListener(searchSortedArrayListButton);
		ButtonActionListener searchArrayButtonActionListener = new ButtonActionListener(searchArrayButton);
			
		searchSortedIntsButton.addActionListener(searchSortedIntsButtonActionListener);
		searchMergeSortButton.addActionListener(searchMergeSortButtonActionListener);
		searchBstButton.addActionListener(searchBstButtonActionListener);
		searchTreeSetButton.addActionListener(searchTreeSetButtonActionListener);
		searchPriorityQueueButton.addActionListener(searchPriorityQueueButtonActionListener);
		searchHashSetButton.addActionListener(searchHashSetButtonActionListener);
		searchArrayListButton.addActionListener(searchArrayListButtonActionListener);
		searchSortedArrayListButton.addActionListener(searchSortedArrayListButtonActionListener);
		searchArrayButton.addActionListener(searchArrayButtonActionListener);		 
		 
		// make the weights non zero so that the components spread out 

		rightButtonPanelConstraints.weightx = 1;
		rightButtonPanelConstraints.weighty = 1;
		 
		// have the components fill all of the cells that they occupy 

		rightButtonPanelConstraints.fill = java.awt.GridBagConstraints.NONE;
		rightButtonPanelConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
		 	
		// row 1
		// put button at (0, 0)
		rightButtonPanelConstraints.gridx = 2;
		rightButtonPanelConstraints.gridy = 0;
		rightButtonPanelConstraints.gridwidth = 1;
		rightButtonGridBagLayout.setConstraints(searchSortedIntsButton,rightButtonPanelConstraints);
		
		// put button at (0, 0)
		rightButtonPanelConstraints.gridx = 3;
		rightButtonPanelConstraints.gridy = 0;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightButtonGridBagLayout.setConstraints(searchSortedIntsLabel,rightButtonPanelConstraints);
		 
		//------------------------------------------------------------------------------------

		// put button at (0, 1)
		rightButtonPanelConstraints.gridx = 2;
		rightButtonPanelConstraints.gridy = 1;
		rightButtonPanelConstraints.gridwidth = 1;
		rightButtonGridBagLayout.setConstraints(searchBstButton,rightButtonPanelConstraints);
		
		// put button at (1, 1)
		rightButtonPanelConstraints.gridx = 3;
		rightButtonPanelConstraints.gridy = 1;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightButtonGridBagLayout.setConstraints(searchBstLabel,rightButtonPanelConstraints);
		
		//------------------------------------------------------------------------------------

		// row 2
		// put button at (1, 0)
		rightButtonPanelConstraints.gridx = 2;
		rightButtonPanelConstraints.gridy = 2;
		rightButtonPanelConstraints.gridwidth = 1;
		rightButtonGridBagLayout.setConstraints(searchTreeSetButton,rightButtonPanelConstraints);
		
		
		rightButtonPanelConstraints.gridx = 3;
		rightButtonPanelConstraints.gridy = 2;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightButtonGridBagLayout.setConstraints(searchTreeSetLabel,rightButtonPanelConstraints);
		 	
		//------------------------------------------------------------------------------------

		
		rightButtonPanelConstraints.gridx = 2;
		rightButtonPanelConstraints.gridy = 3;
		rightButtonPanelConstraints.gridwidth = 1;
		rightButtonGridBagLayout.setConstraints(searchPriorityQueueButton,rightButtonPanelConstraints);
		
		
		rightButtonPanelConstraints.gridx = 3;
		rightButtonPanelConstraints.gridy = 3;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightButtonGridBagLayout.setConstraints(searchPriorityQueueLabel,rightButtonPanelConstraints);
		
		
		//------------------------------------------------------------------------------------

		// row 3
		// put button at (2, 0)
		rightButtonPanelConstraints.gridx = 2;
		rightButtonPanelConstraints.gridy = 4;
		rightButtonPanelConstraints.gridwidth = 1;
		rightButtonGridBagLayout.setConstraints(searchHashSetButton,rightButtonPanelConstraints);
		
		
		rightButtonPanelConstraints.gridx = 3;
		rightButtonPanelConstraints.gridy = 4;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightButtonGridBagLayout.setConstraints(searchHashSetLabel,rightButtonPanelConstraints);
		 	
		
		//------------------------------------------------------------------------------------

		
		rightButtonPanelConstraints.gridx = 2;
		rightButtonPanelConstraints.gridy = 5;
		rightButtonPanelConstraints.gridwidth = 1;
		rightButtonGridBagLayout.setConstraints(searchArrayListButton,rightButtonPanelConstraints);
		
		
		rightButtonPanelConstraints.gridx = 3;
		rightButtonPanelConstraints.gridy = 5;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightButtonGridBagLayout.setConstraints(searchArrayListLabel,rightButtonPanelConstraints);
		 	
		//------------------------------------------------------------------------------------

		
		rightButtonPanelConstraints.gridx = 2;
		rightButtonPanelConstraints.gridy = 6;
		rightButtonPanelConstraints.gridwidth = 1;
		rightButtonGridBagLayout.setConstraints(searchSortedArrayListButton,rightButtonPanelConstraints);
		
		
		rightButtonPanelConstraints.gridx = 3;
		rightButtonPanelConstraints.gridy = 6;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightButtonGridBagLayout.setConstraints(searchSortedArrayListLabel,rightButtonPanelConstraints);
		 	
		//------------------------------------------------------------------------------------

		
		rightButtonPanelConstraints.gridx = 2;
		rightButtonPanelConstraints.gridy = 7;
		rightButtonPanelConstraints.gridwidth = 1;
		rightButtonGridBagLayout.setConstraints(searchArrayButton,rightButtonPanelConstraints);
		
		
		rightButtonPanelConstraints.gridx = 3;
		rightButtonPanelConstraints.gridy = 7;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightButtonGridBagLayout.setConstraints(searchArrayLabel,rightButtonPanelConstraints);
		 
		//------------------------------------------------------------------------------------

		
		rightButtonPanelConstraints.gridx = 2;
		rightButtonPanelConstraints.gridy = 8;
		rightButtonPanelConstraints.gridwidth = 1;
		rightButtonGridBagLayout.setConstraints(searchMergeSortButton,rightButtonPanelConstraints);
				
				
		rightButtonPanelConstraints.gridx = 3;
		rightButtonPanelConstraints.gridy = 8;
		rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		rightButtonGridBagLayout.setConstraints(searchMergeSortLabel,rightButtonPanelConstraints);
				 
		
		
		rightButtonPanel.add(searchSortedIntsButton);
		rightButtonPanel.add(searchMergeSortButton);
	 	rightButtonPanel.add(searchBstButton);
	 	rightButtonPanel.add(searchTreeSetButton);
	 	rightButtonPanel.add(searchPriorityQueueButton);
	 	rightButtonPanel.add(searchHashSetButton);
	 	rightButtonPanel.add(searchArrayListButton);
	 	rightButtonPanel.add(searchSortedArrayListButton);
	 	rightButtonPanel.add(searchArrayButton);
	 	rightButtonPanel.add(searchSortedIntsLabel);
	 	rightButtonPanel.add(searchMergeSortLabel);
	 	rightButtonPanel.add(searchBstLabel);
	 	rightButtonPanel.add(searchTreeSetLabel);
	 	rightButtonPanel.add(searchPriorityQueueLabel);
	 	rightButtonPanel.add(searchHashSetLabel);
	 	rightButtonPanel.add(searchArrayListLabel);
	 	rightButtonPanel.add(searchSortedArrayListLabel);
	 	rightButtonPanel.add(searchArrayLabel);
	 	
	 	
	 	searchSortedIntsButton.setEnabled(false);
	 	searchMergeSortButton.setEnabled(false);
	 	searchBstButton.setEnabled(false);
	 	searchTreeSetButton.setEnabled(false);
	 	searchPriorityQueueButton.setEnabled(false);
	 	searchHashSetButton.setEnabled(false);
	 	searchArrayListButton.setEnabled(false);
	 	searchSortedArrayListButton.setEnabled(false);
	 	searchArrayButton.setEnabled(false);
	 	

		// create the panel to hold the four buttons
		javax.swing.JPanel MainButtonPanel = new javax.swing.JPanel();
		MainButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0,255), 2));
		javax.swing.BoxLayout boxLayout = new javax.swing.BoxLayout(MainButtonPanel, javax.swing.BoxLayout.X_AXIS);
		MainButtonPanel.setLayout(boxLayout);
		
		MainButtonPanel.add(leftButtonPanel);
		MainButtonPanel.add(rightButtonPanel);

		javax.swing.JPanel mainPanel = new javax.swing.JPanel();
		mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0,255), 2));
		mainPanel.setLayout(new java.awt.BorderLayout());
		mainPanel.add(menuBar, java.awt.BorderLayout.NORTH);
		mainPanel.add(MainButtonPanel, java.awt.BorderLayout.CENTER);
		
		f.setContentPane(mainPanel);
		f.validate();
		f.setVisible(true);

	}
	
	static class MenuItemActionListener implements java.awt.event.ActionListener
	{
		// the menu item associated with the action listener, so that we can
				// share this one class with multiple menu items
				private javax.swing.JMenuItem m;
				
				MenuItemActionListener(javax.swing.JMenuItem m)
				{
					this.m = m;
				}
				
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					System.out.println("action performed on " + m.getText() + " menu item");
					
					// if exit is selected from the file menu, exit the program
					if( m.getText().toLowerCase().equals("exit") )
					{
						System.exit(0);
					}
					
					
					if( m.getText().toLowerCase().equals("read sort file") )
						
					{
						
						
						System.out.println("read sort file");
					}
					
					if( m.getText().toLowerCase().equals("read search file") )
					{
						System.out.println("read search file");
					}
				}	
	}
	
	
	// action listener for the buttons
	static class ButtonActionListener implements java.awt.event.ActionListener
	{
		// the button associated with the action listener, so that we can
		// share this one class with multiple buttons
		private javax.swing.JButton b;
		
		
		ButtonActionListener(javax.swing.JButton b)
		{
			this.b = b;
		}
		
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			System.out.println("action performed on " + b.getText() + " button");
			
			if( b.getText().toLowerCase().equals("sort ints") )						//DONE
			{
				
				// call the appropriate method to perform the required action
				long t0 = System.currentTimeMillis();
				selectionSort(sortValues,0,sortValues.length);
				long t1 = System.currentTimeMillis();
				
				sortIntsLabel.setText((t1 - t0) + "ms");
				searchSortedIntsButton.setEnabled(true);

			}		
			if( b.getText().toLowerCase().equals("merge sort ints") )						//DONE
			{
				
				
				long t0 = System.currentTimeMillis();
				mergeSort(sortValues,sortValues.length);
				long t1 = System.currentTimeMillis();
				
				mergeSortLabel.setText((t1 - t0) + "ms");
				searchMergeSortButton.setEnabled(true);

			}		
			if( b.getText().toLowerCase().equals("add to bst") ) 					//COME BACK LATER
			{
				long t0 = System.currentTimeMillis();
				addToBinarySearchTree(sortValues);
				long t1 = System.currentTimeMillis();
				
				addToBstLabel.setText((t1 - t0) + "ms");
				
				searchBstButton.setEnabled(true);
				
			}
			if( b.getText().toLowerCase().equals("add to treeset") ) 				//DONE
			{
				long t0 = System.currentTimeMillis();
				addToTreeSet(sortValues);
				long t1 = System.currentTimeMillis();
				
				addToTreeSetLabel.setText((t1 - t0) + "ms");
				
				searchTreeSetButton.setEnabled(true);
			}
			if( b.getText().toLowerCase().equals("add to priority queue") )			//DONE
			{
				long t0 = System.currentTimeMillis();
				addToPriorityQueue(sortValues);
				long t1 = System.currentTimeMillis();
				
				addToPriorityQueueLabel.setText((t1 - t0) + "ms");
				
				searchPriorityQueueButton.setEnabled(true);
			}
			if( b.getText().toLowerCase().equals("add to hash set") )				//DONE
			{
				long t0 = System.currentTimeMillis();
				addToHashSet(sortValues);
				long t1 = System.currentTimeMillis();
				
				addToHashSetLabel.setText((t1 - t0) + "ms");
				
				searchHashSetButton.setEnabled(true);
			}
			if( b.getText().toLowerCase().equals("add to array list") )				//DONE
			{
				long t0 = System.currentTimeMillis();
				addToArrayList(sortValues);
				long t1 = System.currentTimeMillis();
				
				addToArrayListLabel.setText((t1 - t0) + "ms");
				
				searchArrayListButton.setEnabled(true);
			}
			if( b.getText().toLowerCase().equals("add to sorted array list") )		//DONE
			{
				long t0 = System.currentTimeMillis();
				addToSortedArrayList(sortValues);
				long t1 = System.currentTimeMillis();
				
				addToSortedArrayListLabel.setText((t1 - t0) + "ms");
				
				searchSortedArrayListButton.setEnabled(true);
			 	
				
			}
			if( b.getText().toLowerCase().equals("add to array") )					//DONE
			{
				long t0 = System.currentTimeMillis();
				addToArray(sortValues);
				long t1 = System.currentTimeMillis();
				
				addToArrayLabel.setText((t1 - t0) + "ms");
				
				searchArrayButton.setEnabled(true);
			}
			
		 	
			if( b.getText().toLowerCase().equals("search sorted ints") )				
			{
				// call the appropriate method to perform the required action
				int c = 0;
				long t0 = System.currentTimeMillis();
				for(int a = 0; a< searchValues.length;a++)
				{
				int f = searchInts(sortedValues, searchValues[a]);
				
					if(f == searchValues[a])
					{
						c++;
					}
				}
				long t1 = System.currentTimeMillis();
				
				searchSortedIntsLabel.setText(c +" / "+ (t1 - t0) + "ms");

			}
			
			if( b.getText().toLowerCase().equals("search merge sorted ints") )		 //==================
			{
				
				int c = 0;
				long t0 = System.currentTimeMillis();
				for(int a = 0; a< searchValues.length;a++)
				{
				int f = searchMergeSortedInts(sortedValues1, searchValues[a]);
				
					if(f == searchValues[a])
					{
						c++;
					}
				}
				long t1 = System.currentTimeMillis();
				
				searchMergeSortLabel.setText(c +" / "+ (t1 - t0) + "ms");

			}
			
			if( b.getText().toLowerCase().equals("search bst") ) 					//
			{
				int c = 0;
				long t0 = System.currentTimeMillis();
				for(int a = 0; a< searchValues.length;a++)
				{
				boolean f = searchBinarySearchTree(bst,searchValues[a]);
				
					if(f == true)
					{
						c++;
					}
				}
				long t1 = System.currentTimeMillis();
				searchBstLabel.setText(c +" / "+(t1 - t0) + "ms");
				
			}
			
			if( b.getText().toLowerCase().equals("search treeset") ) 				//
			{
				int c = 0;
				long t0 = System.currentTimeMillis();
				for(int a = 0; a< searchValues.length;a++) 
				{
				int f = searchTreeSet(treeSetValues,searchValues[a]);

					if(f == searchValues[a])
					{
						c++;
					}
				}
				long t1 = System.currentTimeMillis();
				
				searchTreeSetLabel.setText(c +" / "+(t1 - t0) + "ms");
			}
			if( b.getText().toLowerCase().equals("search priority queue") )			//
			{
				int c = 0;
				long t0 = System.currentTimeMillis();
				for(int a = 0; a< searchValues.length;a++)
				{
				int f = searchPriorityQueue(priorityQueueValues,searchValues[a]);
					if(f == searchValues[a])
					{
						c++;
					}
				}
				long t1 = System.currentTimeMillis();
				
				searchPriorityQueueLabel.setText(c +" / "+(t1 - t0) + "ms");
			}
			if( b.getText().toLowerCase().equals("search hash set") )				//
			{
				
				int c = 0;
				long t0 = System.currentTimeMillis();
				for(int a = 0; a< searchValues.length;a++)
				{
				int f = searchHashSet(hashSetValues,searchValues[a]);
					if(f == searchValues[a])
					{
						c++;
					}
				}
				long t1 = System.currentTimeMillis();
				
				searchHashSetLabel.setText(c +" / "+(t1 - t0) +  "ms");
			}
			if( b.getText().toLowerCase().equals("search array list") )				//
			{
				int c = 0;
				long t0 = System.currentTimeMillis();
				for(int a = 0; a< searchValues.length;a++)
				{
				int f = searchArrayList(arrayListValues,searchValues[a]);
					if(f>0)
					{
						c++;
					}
				}
				long t1 = System.currentTimeMillis();
				
				searchArrayListLabel.setText(c +" / "+(t1 - t0) +  "ms");
			}
			if( b.getText().toLowerCase().equals("search sorted array list") )		// 
			{
				int c = 0;
				long t0 = System.currentTimeMillis();
				for(int a = 0; a< searchValues.length;a++)
				{
				int f = searchSortedArrayList(sortedArrayListValues,searchValues[a]);
					if(f>0)
					{
						c++;
					}
				}
				long t1 = System.currentTimeMillis();
				
				searchSortedArrayListLabel.setText(c +" / "+(t1 - t0) +  "ms");
			}
			if( b.getText().toLowerCase().equals("search array") )					//
			{
				int c = 0;
				long t0 = System.currentTimeMillis();
				for(int a = 0; a< searchValues.length;a++)
				{
				int f = searchArray(unsortedValues,searchValues[a]);
					if(f>0)
					{
						c++;
					}
				}
				long t1 = System.currentTimeMillis();
				
				searchArrayLabel.setText(c +" / "+(t1 - t0) +  "ms");
			}
			
		}
		
	}	
	
	private static void selectionSort(int[] sortedValues11, int lowerBound, int upperBound) //  Cannot read the array length because "sortedValues" is null --> sortInt button 
	{
		  
		 
		  for ( int j= lowerBound; j < upperBound; j++ )
		  {
			  	int min = j;
		        for ( int k=j+1; k < upperBound; k++ )
		        {
		        	if ( sortedValues11[k] < sortedValues11[min] )
		        	{  
		        		min = k;
		            }  
		                 
		            	int temp = sortedValues11[j];
		            	sortedValues11[j] = sortedValues11[min];
		            	sortedValues11[min] = temp;
		        }
		  }
		  
		  sortedValues = new int[sortedValues11.length];
		  for(int i = 0; i< sortedValues11.length;i++)
          {
          	sortedValues[i] = sortedValues11[i];
          }
		  
		  
		                 
	}
	
	private static int searchInts(int[] sortedValues, int searchValue)  //Cannot read the array length because "sortedValues" is null
	{
		int searchedValue = 0; 
	    int bottom = 0;
	    int top = sortedValues.length-1;
	    while(bottom<=top)
	    {
	    	int middle = (bottom+top)/2;
	    	
	    	if(searchValue < sortedValues[middle])
	    	{
	    		top = middle-1;
	    	}
	    	else
	    	{
	    		if(searchValue > sortedValues[middle])
	    		{
	    			bottom = middle + 1;
	    		}
	    		else
	    		{
	    			searchedValue = searchValue;
	    			break;
	    		}
	    	}
	    }
		return searchedValue;	
	}
	private static void mergeSort(int[] sortArray, int lengthOfArray) 
	{
		
		if (lengthOfArray < 2) 
		{
			return;
		}
		
		int mid = lengthOfArray / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[lengthOfArray - mid];
	
		for (int i = 0; i < mid; i++) 
		{
			leftArray[i] = sortArray[i];
		}
		
		for (int i = mid; i < lengthOfArray; i++) 
		{
			rightArray[i - mid] = sortArray[i];
		}
		
		mergeSort(leftArray, mid);
		mergeSort(rightArray, lengthOfArray - mid);
	
		merge(sortArray, leftArray, rightArray, mid, lengthOfArray - mid);
		
		sortedValues1 = new int[sortArray.length]; // an array to search in search merge sorted ints
		  for(int i = 0; i< sortArray.length;i++)
        {
        	sortedValues1[i] = sortArray[i];
        }
	}

	private static void merge(int[] sortArray, int[] leftArray, int[] rightArray, int left, int right) 
	{
 
		int i = 0, j = 0, k = 0;
		
		while (i < left && j < right) 
		{
	        if (leftArray[i] <= rightArray[j]) 
	        {
	            sortArray[k++] = leftArray[i++];
	        }
	        else 
	        {
	            sortArray[k++] = rightArray[j++];
	        }
		}
		
		while (i < left) 
		{
			sortArray[k++] = leftArray[i++];
		}
		while (j < right) 
		{
			sortArray[k++] = rightArray[j++];
		}
	}
	
	private static int searchMergeSortedInts(int[] sortedValues, int searchValue)  //Cannot read the array length because "sortedValues" is null
	{
		int searchedValue = 0; 
	    int bottom = 0;
	    int top = sortedValues.length-1;
	    while(bottom<=top)
	    {
	    	int middle = (bottom+top)/2;
	    	
	    	if(searchValue < sortedValues[middle])
	    	{
	    		top = middle-1;
	    	}
	    	else
	    	{
	    		if(searchValue > sortedValues[middle])
	    		{
	    			bottom = middle + 1;
	    		}
	    		else
	    		{
	    			searchedValue = searchValue;
	    			break;
	    		}
	    	}
	    }
		return searchedValue;	
	}
	
	private static void addToBinarySearchTree(int[] values)						
	{
		for(Integer i: sortValues)
		{
			
			Node a = new Node(i);
			bst.insertNode(a);
		}
		
	}
	
	
	
	
	private static boolean searchBinarySearchTree(BinarySearchTree bst,int searchValue)  //PROBLEM
	{
		boolean returnValue = false;
		for(Integer i: sortValues)
		{
			Node a = new Node(searchValue);
			if(bst.getNode(a, i) != null)
			{
				returnValue = true;
			}
		}
		return returnValue;
			
	}
	
	
	private static void addToTreeSet(int[] values)
	{
		for(Integer i: values)
		{
			treeSetValues.add(i);
		}
	}
	
	
	private static int searchTreeSet(java.util.TreeSet<Integer> treeSetValues, int searchValue)
	{
		int returnValue = 0;
		if(treeSetValues.contains(searchValue))
		{
			returnValue = searchValue;
		}
		return returnValue;
	}
	
	
	private static void addToHashSet(int[] values)
	{
		for(Integer i: values)
		{
			hashSetValues.add(i);
		}
	}
	
	
	private static int searchHashSet(java.util.HashSet<Integer> hashSetValues, int searchValue)
	{
		int returnValue = 0;
		if(hashSetValues.contains(searchValue))
		{
			returnValue = searchValue;
		}
		return returnValue;
	}
	
	
	private static void addToPriorityQueue(int[] values)
	{
		for(Integer i: values)
		{
			priorityQueueValues.add(i);
		}
	}
	
	
	private static int searchPriorityQueue(java.util.PriorityQueue<Integer> priorityQueueValues, int searchValue)
	{
		int returnValue = 0;
		if(priorityQueueValues.contains(searchValue))
		{
			returnValue = searchValue;
		}
		return returnValue;
	}
	
	
	private static void addToArrayList(int[] values)
	{
		for(Integer i: values)
		{
			arrayListValues.add(i);
		}
	}
	
	
	private static int searchArrayList(java.util.ArrayList<Integer> arrayListValues, int searchValue)
	{
		int returnValue = 0;
		if(arrayListValues.contains(searchValue))
		{
			returnValue = searchValue;
		}
		return returnValue;
	}
	
	
	private static void addToSortedArrayList(int[] values) 
	{
		
		for(Integer i: values)
		{
			 sortedArrayListValues.add(i);	 
		}
		
		java.util.Collections.sort(sortedArrayListValues);
		
	}
	
	
	private static int searchSortedArrayList(java.util.ArrayList<Integer> sortedArrayListValues, int searchValue) // Index -1 out of bounds for length 0
	{
		
			
			int index = java.util.Collections.binarySearch(sortedArrayListValues, searchValue);
			if(index < 0)
			{
				return 0;
			}
			else
			{
				return sortedArrayListValues.get(index);
			}
		
	}
	
	
	private static void addToArray(int[] values)
	{
		unsortedValues 	= new int[values.length];
		for(int i=0; i<values.length;++i)
		{
			 unsortedValues[i] = values[i];
		}
	}
	

	private static int searchArray(int[] unsortedValues, int searchValue)  //Cannot read the array length because "unsortedValues" is null
	{
		int returnValue = 0;
		for(Integer i: unsortedValues)
		{
			if(i==searchValue)
			{
				returnValue = searchValue;
			}
		}
		return returnValue;
	}
	
	
	private static void readData(String filename)	//I cannot save the values to sortedValues above
	{
		try
		{
            java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
            java.util.ArrayList<Integer> output = new java.util.ArrayList<>();
           
          
            String Line  = input.readLine();
           
            while(Line != null)
			{    
            	output.add(Integer.valueOf(Line));
            	Line=input.readLine();
			}
            
            if(filename.contains("sort"))
            {
            	
            	sortValues = new int[output.size()];
	            for(int i = 0; i< output.size();i++)
	            {
	            	sortValues[i] = output.get(i);
	            }
	           
	            
            }
            if(filename.contains("search"))
            {
            	 searchValues = new int[output.size()];
                 for(int j = 0; j< output.size();j++)
                 {
                 	searchValues[j] = output.get(j);
                 }
                 
            }
            
           
  
            input.close();
           
		}
			catch(Exception e)
			{
				System.out.println(e.toString());
				System.exit(0);
			}
	}
	
}





