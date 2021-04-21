# Activity1-Soil_Correction
Caio Kera Iwamoto<br />
Universidade Tecnológica Federal do Paraná<br />

<h3>(i) Códigos antes das mudanças</h3><br />
Classe CalculoFosforo.java<br />
<pre>
prompt> .\cloc-1.88.exe CalculoFosforo.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.04 s (26.3 files/s, 2415.8 lines/s)<h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1             16              0             76
-------------------------------------------------------------------------------
</pre>
Classe CalculoPotassio.java<br />
<pre>
prompt> .\cloc-1.88.exe CalculoPotassio.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.05 s (20.9 files/s, 563.5 lines/s)<h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1              5              0             22
-------------------------------------------------------------------------------
</pre>
Classe CalculoTeor.java<br />
<pre>
prompt> .\cloc-1.88.exe CalculoTeor.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.15 s (6.6 files/s, 1023.6 lines/s)<h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1             29              3            122
-------------------------------------------------------------------------------
</pre>
Classe Somatoria.java<br />
<pre>
prompt> .\cloc-1.88.exe Somatoria.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.12 s (8.2 files/s, 419.9 lines/s)<h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1             11              0             40
-------------------------------------------------------------------------------
</pre>
<hr width=100%>
<h3>(ii) Problemas encontrados</h3><br />
Após analizar os códigos alguns problemas foram encontrados, entre eles estão:<br />
1- A classe "CalculoPotassio.java", que é desnecessária para o funcionamento do código.<br />
2- Algumas estruturas condicionais desnecessárias dentro da classe "CalculoPotassio.java".<br />
3- Linhas em branco dentro da classe "Somatoria.java" e da classe "CalculoTeor".<br />
4- Comentários desnecessários na classe "CalculoTeor.java".<br />
<hr width=100%>
<h3>(iii) Soluções encontradas</h3><br />
Para resolver os problemas 1 e 2 apontados, primeiramente foi realizado a alteração das estruturas condicionais da classe "CalculoPotassio.java" armazenando os valores em um vetor, todo o conteúdo remanescente foi transferido para as demais classes que fariam mais sentido no contexto, logo em seguida a classe foi deletada do projeto. Para os problemas 3 e 4, foram removidos os comentários desnecessários e as linhas em branco no código.<br />
A classe do "CalculoFosforo" recebeu um aumento em seu tamanho de código, mas se analisarmos, esse ganho foi pequeno diante daquilo que foi retirado do projeto como um todo.
<hr width=100%>
<h3>(iv) Implementação das soluções</h3><br />
Commit: e221514cab2c8a0784650ae8461321a19e9b0a3f
<hr width=100%>
<h3>(v) Código depois das alterações</h3><br />
Classe CalculoFosforo.java<br />
<pre>
prompt> .\cloc-1.88.exe CalculoFosforo.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.01 s (68.6 files/s, 7133.1 lines/s)<h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1             18              0             86
-------------------------------------------------------------------------------
</pre>
Classe CalculoTeor.java<br />
<pre>
prompt> .\cloc-1.88.exe CalculoTeor.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.01 s (70.0 files/s, 10359.9 lines/s)<h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1             27              0            121
-------------------------------------------------------------------------------
</pre>
Classe Somatoria.java<br />
<pre>
prompt> .\cloc-1.88.exe Somatoria.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.01 s (69.9 files/s, 3147.3 lines/s)<h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1              5              0             40
-------------------------------------------------------------------------------
</pre>
