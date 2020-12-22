/* 1.In the following comment I try to explain this code.
   2.This comment is only for my reference.
*/
#include <stdio.h>
#include <stdlib.h>
/* 1.Creating structure variable for linked list
   2.Using type def to (struct node -> Node) for convenient
*/
typedef struct node
{
    int data;
    int *left;
    int *right;
}Node;
//  Add the reference to point the root node
Node *root=NULL;
/*
    1.Using push method to insert the element into the tree
    2.If it is the first element create the node and assign the current node as a root
    3.If the tree already having an element using parent pointer to traverse into the
        end position and add the link accordingly
        i)  if the current node is less than the parent node add the node as a left child
        ii) if the current node is grater than the parent node add the node  as a right child
*/
void push(int item)
{
    Node *t=(Node*)malloc(sizeof(Node));
    t->data=item;
    t->left=NULL;
    t->right=NULL;
    if(root==NULL)
    {
        root=t;
    }
    else
    {
        Node *parent=root;
        Node *curr=root;
       while(curr!=NULL)
       {
        parent=curr;
        if(t->data < curr->data)
        {
            curr=curr->left;
        }
        else{
            curr=curr->right;
        }
       }
       if(t->data < parent->data)
       {
        parent->left=t;
       }
       else{
        parent->right=t;
       }
    }
}
/*  1.In Order   -> left child, parent, right child
    2.Pre Order  -> parent, left child, right child
    3.Post Order -> left child, right child, parent
*/
void inOrder(Node * temp)
{
    if(temp==NULL)
    {
     printf("Tree is Empty");
     return;
    }
    if(temp->left!=NULL)
    {
        inOrder(temp->left);
    }
    printf("%d ",temp->data);
    if(temp->right!=NULL)
    {
        inOrder(temp->right);
    }

}
void preOrder(Node * temp)
{   if(temp==NULL)
    {
     printf("Tree is Empty");
     return;
    }
    printf("%d ",temp->data);
    if(temp->left!=NULL)
    {
        preOrder(temp->left);
    }
    if(temp->right!=NULL)
    {
        preOrder(temp->right);
    }

}
void postOrder(Node * temp)
{   if(temp==NULL)
    {
     printf("Tree is Empty");
     return;
    }
    if(temp->left!=NULL)
    {
        postOrder(temp->left);
    }
    if(temp->right!=NULL)
    {
        postOrder(temp->right);
    }
    printf("%d ",temp->data);
}
/*
    1.The most trickiest part in the Binary Search Tree(BST) is deletion.
    2.Three possible cases when we want to delete a node.
        i)The having no left and right child(left node)
        ii)The node having one child
        iii)The node having two child.
    All the cases are briefly explained in below code.
*/
void del(int item)
{   /*First we want to traverse the node to be delete
    Parent node is used for linking the new node after deletion*/
    Node *par=NULL;
    Node *child=root;
    // 1.child is null if the item is does not exist in the tree
    // 2.To stop the loop if the child's data equal to item
    while(child!=NULL && child->data!=item)
    {   par=child;
        if(item < child->data)
        {
            child=child->left;
        }
        else{
            child=child->right;
        }

    }
    //For element does not exist
    if(child==NULL)
    {
        printf("The element does not exist");
        return;
    }
    else
    {   // Check the condition node does not have any child
        if(child->left==NULL && child->right==NULL)
        {   //If it is a root element change root pointer to null
            if(child==root)
            {
                root=NULL;
            }
            else
            {   //If the node having no child change parent left and right pointer to null
                if(par->data < child->data)
                {
                    par->right=NULL;
                }
                else
                {
                    par->left=NULL;
                }
            }

        }
        /* 1.If you found one child in the left
           2.Connect that left child into parent
           3.If it is root change root to deleted node left tree */
        else if(child->left!=NULL && child->right==NULL)
        {
            if(child==root)
            {
                root=child->left;
            }
            else
            {
                par->left=child->left;
            }
        }
        //Follow the above method to one child having in right
        else if(child->left==NULL && child->right!=NULL)
        {
            if(child==root)
            {
                root=child->right;
            }
            else
            {
                par->right=child->right;
            }
        }
        else
        {   /* 1.If the deleting node have two child we want find the next successor node.
               2.We want to find lowest data element node in right sub tree of deleted node.
               3.This is the left most child in the right sub tree.
               4.If left most subtree is found in the tree assign node right tree as a new node.
               5.If these explanation is not understood refer internet.
               6.These lines are only for my reference.
            */
            Node *par2;
            Node *child2=child->right;
            if(child2->left==NULL)
            {
                if(child==root)
                {
                    root=child2;
                }
                else
                {
                    if(child2->data < par->data)
                    {
                        par->left=child2;
                    }
                    else
                    {
                        par->right=child2;
                    }
                }
                child2->left=child->left;
            }
            else
            {
                while(child2->left!=NULL)
                {
                    par2=child2;
                    child2=child2->left;
                }
                if(child==root)
                {
                    root=child2;
                }
                else
                {
                    if(child2->data < par->data)
                    {
                        par->left=child2;
                    }
                    else
                    {
                        par->right=child2;
                    }
                }
                child2->left=child->left;
                child2->right=child->right;
                par2->left=NULL;

            }
        }
    }
}
void main()
{
    char ch;
    int n,n1,num,item;
    do
    {   printf("Press the valid key based on operation");
        printf("\n1.Inserting Node to the tree");
        printf("\n2.Inserting array of element");
        printf("\n3.Deleting the element from the tree");
        printf("\n4.Display the content");
        printf("\n5.Sort the element");
        printf("\n6.Exit\n");
        scanf("%d",&n);
        switch(n)
        {
            case 1:
                printf("Enter the data to the tree\n");
                scanf("%d",&item);
                push(item);
                break;
            case 2:
                printf("Enter the number of element want to insert\n");
                scanf("%d",&num);
                printf("Enter the element continuosly separated by space\n");
                for(int i=0;i<num;i++)
                {
                    scanf("%d",&item);
                    push(item);
                }
                break;
            case 3:
                printf("Enter the element to delete\n");
                scanf("%d",&item);
                del(item);
                break;
            case 4:
                printf("Enter the type of display");
                printf("\n1.In Order search");
                printf("\n2.Pre Order search");
                printf("\n3.Post Order search\n");
                scanf("%d",&n1);
                switch(n1)
                {
                case 1:
                    inOrder(root);
                    break;
                case 2:
                    preOrder(root);
                    break;
                case 3:
                    postOrder(root);
                    break;
                default:
                    printf("\nInvalid option");
                }
            break;
            case 5:
                    inOrder(root);
                    break;
            case 6:
                    exit(0);
                    break;
            default:
                printf("\nInvalid option");

        }
        printf("\nDo you want to continue press y / Y\n");
        scanf(" %c",&ch);
    }while((ch=='y')||(ch=='Y'));
}
