class Node
{
	Node left,right;

	int frequency;

	String[] word = new String[20];

	int height;

	String[][] type = new String[10][10];

	int num[10][10];



/* constructor */

	public Node()
	{
		 left = null;

         right = null;

         frequency = 0;

         height = 0;

	}

/* constructor ends */

	public Node(int n)

     {

         left = null;

         right = null;

         frequency = n;

         height = 0;

     }     


}


class AVLtree
{
	

	private Node root;


	public AVLtree()
	{
		root = null;
	}

	

	public boolean isEmpty()
	{
		if (root==null)
			return 0;

		else 
			return 1;
	}

	

	public void insert(DATA)								/* DATA enter karo */

     {

         root = insert(DATA, root);							// DATA enter karo

     }

     

     private int height(Node n)

     {
         if (n==null)
         {
         	return -1;
         }
         else
         	return n.height;

     }

     

     private int max(int lhs, int rhs)

     {

         return lhs > rhs ? lhs : rhs;

     }

     

     private Node insert(DATA,Node n)							/* relevant DATA enter karo */
     {
     	if (n==null)
     	{
     		n = new Node(DATA); 
     	}

     	else if(frequency < n.left)
     	{	
     		n.left = insert(DATA, n.left);						// DATA enter karo

     		if( height( n.left ) - height( n.right ) > 1 )

                 if( x < n.left.frequency )

                     n = rotatewithLeftChild( n );

                 else

                     n = doublewithLeftChild( n );

        }


         else if( frequency > n.data )

         {

             n.right = insert(DATA, n.right );				// DATA enter karvaanu che

             if( height( n.right ) - height( n.left ) > 1 )

                 if( x > n.right.frequency)

                     n = rotateWithRightChild( n );

                 else

                     n = doubleWithRightChild( n );

         }

         else

          ;

         n.height = max( height( n.left ), height( n.right ) ) + 1;

         return n;



     }


}

