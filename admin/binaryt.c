#include<stdio.h>
#include<stdlib.h>

struct node{
	char data;
	struct node *left,*right;
	/*node(int data){
		//this=(struct node*)malloc(sizeof(struct node));
		this->data=data;
		left=right=NULL;
		//return node;
	}*/
}*root,*temp;

void print(char preorder[],char inorder[]){
	int t;
	int p=sizeof(preorder);
	int in=sizeof(inorder);
		temp=(struct node*)malloc(sizeof(struct node));
	temp->data=preorder[0];
	root=temp;
	//printf("%d",root->data);
	for(i=0;i<sizeof(preorder);i++){
		if(inorder[i]=root->data){
		 t=i;
		}
	}
	printf("%d",t);
	char p1[t];
	char p2[p-t-1];
	char i1[t];
	char i2[p-t-1];
	for(i=0;i<t-1;i++){
		i1[i]=inorder[i];
	}
	for(i=0;i<p-t-1;i++){
		i2[i]=inorder[t+1];
	}
	for(i=0;i<t-1;i++){
		p1[i]=preorder[i+1];
	}
	for(i=0;i<p-t-1;i++){
		p2[i]=preorder[t+1];
	}




}

int main(){
	root=NULL;
	/*temp=(struct node*)malloc(sizeof(struct node));
	temp->data=4;
	root=temp;
	printf("%d",root->data);*/
	char inorder[]={'D','B','E','A','C','F'};
	char preorder[]={'A','B','D','E','C','F'};
	printf("%d",sizeof(preorder));
	 
	 print(inorder,preorder);
	return 0;


}