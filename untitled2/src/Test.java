/*
Inorder (Left, Root, Right): 4 2 5 1 3
Preorder (Root, Left, Right): 1 2 4 5 3
Postorder (Left, Right, Root): 4 5 2 3 1
*/

//트리의 노드 생성
class Node{
    int data;
    Node left;
    Node right;
}
// 트리 클래스에는 루트의 시작점 생성
class Tree{
    public Node root;

    public void setRoot(Node node){
        this.root = node;
    }
    public Node getRoot(){
        return root;
    }
    //노드를 만드는 함수 makeNode는 data,left,right 할당 받는다
    public Node makeNode(Node left, int data, Node right){
        Node node = new Node ();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }
    // inorder 함수는 왼쪽, 자신, 오른쪽
    public void inorder(Node node){
        //노드가 null이 아닐때까지 재귀호출
        if (node != null){
            inorder ( node.left );
            System.out.println (node.data );
            inorder ( node.right );
        }
    }
    // preorder 자신, 왼쪽, 오른쪽
    public void preorder(Node node){
        if (node != null){
            System.out.println (node.data);
            preorder ( node.left );
            preorder ( node.right );
        }
    }
    // postorder 왼쪽, 오른쪽, 자신
    public void postorder(Node node){
        if(node != null){
            postorder ( node.left );
            postorder ( node.right );
            System.out.println (node.data);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n4 = t.makeNode ( null,4,null );
        Node n5 = t.makeNode ( null,5,null );
        Node n2 = t.makeNode ( n4,2,n5 );
        Node n3 = t.makeNode ( null, 3, null );
        Node n1 = t.makeNode ( n2, 1, n3 );
        t.setRoot ( n1 );
        t.inorder ( t.getRoot() );
        System.out.println ("----------------------------");
        t.preorder ( t.getRoot () );
        System.out.println ("----------------------------");
        t.postorder ( t.getRoot () );
    }
}
