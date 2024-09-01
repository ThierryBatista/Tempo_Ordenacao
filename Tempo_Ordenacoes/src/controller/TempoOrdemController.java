package controller;
import quicksort.batista.QuickSort;
import bubblesort.batista.BubbleSort;
import mergesort.batista.MergeSort;

public class TempoOrdemController
{
 public TempoOrdemController()
 {
 super();
 }
 
 public int[] OrdenarB(int[] vet)
 {
  BubbleSort Bubbles = new BubbleSort();
  long inicio = System.nanoTime();
  vet = Bubbles.Bubbles(vet);
  long fim = System.nanoTime();
  System.out.println(" A duração da operação com BubbleSort é de " + (fim - inicio) / Math.pow(10,9) + " segundos");
  return vet;
 }
 public int[] OrdenarM(int[] vet)
 {
  MergeSort merge = new MergeSort();
  long inicio = System.nanoTime();
  vet = merge.Merge(vet, 0, vet.length - 1);
  long fim = System.nanoTime();
  System.out.println(" A duração da operação com MergeSort é de " + (fim - inicio) / Math.pow(10,9) + " segundos");
  return vet;
 }

  public int[] OrdenarQ(int[] vet)
 {
  QuickSort quick = new QuickSort();
  long inicio = System.nanoTime();
  vet = quick.quick(vet, 0, vet.length - 1);
  long fim = System.nanoTime();
  System.out.println(" A duração da operação com QuickSort é de " + (fim - inicio) / Math.pow(10,9) + " segundos");
  return vet;
 }
}