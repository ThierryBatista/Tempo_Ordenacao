package view;

import controller.TempoOrdemController;

public class TempoOrdem
{
 public static void main(String Args[])
 {
 TempoOrdemController sort = new TempoOrdemController();
 int[] vet = new int[1500];
 int k = 1499;
 
 for (int i = 0; i < 1500; i++)
  {
   vet[i] = k;
   k--;
  }
  vet = sort.OrdenarB(vet);
  vet = sort.OrdenarM(vet);
  vet = sort.OrdenarQ(vet);
 }
}