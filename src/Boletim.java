public class Boletim {
    public Resultado avaliar(NotasAluno notasAluno){
       int qtdAprovacoes = 0;
       int qtdReprovacoes = 0;
        for (NotaDisciplina item : notasAluno.getNotasDisciplina()){
           String sit = verificarSituacao(item.getMedia(), item.getFaltas());
           if(sit.equals("aprovado")){
               qtdAprovacoes++;
           }else{
               qtdReprovacoes++;
           }

       }
        Resultado res = new Resultado();
        res.setAluno(notasAluno.getAluno());
        res.setNotaDisciplina(notasAluno.getNotasDisciplina());
        res.setQtdAprovacao(qtdAprovacoes);
        res.setQtdReprovacao(qtdReprovacoes);

        if(qtdReprovacoes==0)
            res.setSituacao("aprovado");
        else
            res.setSituacao("reprovado");
        return res;
    }

    private String verificarSituacao(double media, int faltas){
        String sit = "";

        if (media < 6 ){
            sit = "Reprovado por media";
        } else if (faltas > 4) {
            sit = "Reprovado por faltas";
        }else{
            sit = "aprovado";
        }
    return sit;
        }



    }

