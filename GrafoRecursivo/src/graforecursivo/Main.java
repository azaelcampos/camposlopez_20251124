/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graforecursivo;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('A'); //Indice 0
        grafo.insertarNodo('B'); // 1
        grafo.insertarNodo('C'); //2
        grafo.insertarNodo('D'); //3
        
        grafo.conectar(0,1); //ARISTA(A,B)
        grafo.conectar(0,2); //(A,C)
        grafo.conectar(2,3); //(B,D)
        grafo.conectar(2,3); //(C,D)
        
        System.out.println("Recorrido Depth First Search (DFS) desde el nodo A");
        
        grafo.dfs(0);
        //TEORICAMENTE EL RECORRIDO ES;
        //VISITADO NODO A;
        //LUEGO VISITADO NODO B (SERIA EL PRIMER ADYACENTE DE A)
        //LUEGO VISITA 0 (QUE SERIA EL ADYACENTE DE B)
        //LUEGO RETROCEDE (VUELVE A LA RAIZ) Y VISITA C (QUE SERIA EL ADYACENTE NO VISITADO DE A)
        
    }
    
}
