public class ForEach{
    public static void main(String[]args){
        String alunos []={"João", "Maria", "Pedro", "Ana", "Lucas"};

        /*Com o Each, é a cada interção */
        for (String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}