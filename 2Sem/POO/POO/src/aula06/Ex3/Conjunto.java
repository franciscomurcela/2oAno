package aula06.Ex3;

public class Conjunto {
    private int[] conjunto = new int[100];
    Conjunto(){
        for(int i = 0; i < conjunto.length; i++){
            conjunto[i] = 0;
        }
    }

    public void insert(int n){
        for(int i = 0; i < conjunto.length; i++){
            if (conjunto[i] == n){
                break;
            }
            if(conjunto[i] == 0){
                conjunto[i] = n;
                break;
            }
        }
    }

    public void remove(int n){
        for(int i = 0; i < conjunto.length; i++){
            if(conjunto[i] == n){
                conjunto[i] = 0;
                break;
            }
        }
    }

    public boolean contains(int n){
        for(int i = 0; i < conjunto.length; i++){
            if(conjunto[i] == n){
                return true;
            }
        }
        return false;
    }

    public int size(){
        int count = 0;
        for(int i = 0; i < conjunto.length; i++){
            if(conjunto[i] != 0){
                count++;
            }
        }
        return count;
    }

    public Conjunto unir(Conjunto add){
        Conjunto uniao = new Conjunto();
        for(int i = 0; i < conjunto.length; i++){
            if(conjunto[i] != 0){
                uniao.insert(conjunto[i]);
            }
        }
        for(int i = 0; i < add.conjunto.length; i++){
            if(add.conjunto[i] != 0){
                uniao.insert(add.conjunto[i]);
            }
        }
        return uniao;
    }

    public Conjunto interset(Conjunto inter){
        Conjunto intersecao = new Conjunto();
        for(int i = 0; i < conjunto.length; i++){
            for(int j = 0; j < inter.conjunto.length; j++){
                if(conjunto[i] == inter.conjunto[j]){
                    intersecao.insert(conjunto[i]);
                }
            }
        }
        return intersecao;
    }

    public Conjunto subtrair(Conjunto dif){
        Conjunto diferenca = new Conjunto();
        for(int i = 0; i < conjunto.length; i++){
            if(conjunto[i] != 0){
                diferenca.insert(conjunto[i]);
            }
        }
        for(int i = 0; i < dif.conjunto.length; i++){
            if(dif.conjunto[i] != 0){
                diferenca.remove(dif.conjunto[i]);
            }
        }
        return diferenca;
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < conjunto.length; i++){
            if(conjunto[i] != 0){
                str += conjunto[i] + " ";
            }
        }
        return str;
    }

    public void empty(){
        for(int i = 0; i < conjunto.length; i++){
            if(conjunto[i] != 0){
                remove(conjunto[i]);
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Insira um número: ");
        Conjunto c1 = new Conjunto();
        c1.insert(4); c1.insert(7); c1.insert(6); c1.insert(5);
        Conjunto c2 = new Conjunto();
        int[] test = { 7, 3, 2, 5, 4, 6, 7};
        for (int el : test) c2.insert(el);
        c2.remove(3); c2.remove(5); c2.remove(6);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Número de elementos em c1: " + c1.size());
        System.out.println("Número de elementos em c2: " + c2.size());
        System.out.println("c1 contém 6?: " + ((c1.contains(6) ? "sim" : "não")));
        System.out.println("c2 contém 6?: " + ((c2.contains(6) ? "sim" : "não")));
        System.out.println("União:" + c1.unir(c2));
        System.out.println("Interseção:" + c1.interset(c2));
        System.out.println("Diferença:" + c1.subtrair(c2));
        c1.empty();
        System.out.println("c1:" + c1);      
    }
}


