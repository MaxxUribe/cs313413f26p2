package cs271.lab.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPerformance {

  // DONE run test and record running times for SIZE = 10, 100, 1000, 10000, ...
  // (choose in conjunction with REPS below up to an upper limit where the clock
  // running time is in the tens of seconds)
  // DONE Question: What conclusions can you draw about the performance of LinkedList vs. ArrayList when
  // comparing their running times for AddRemove vs. Access? Record those running times in README.txt!
  // TODO (optional) refactor to DRY
  // which of the two lists performs better as the size increases?
  private final int SIZE = 100;

  // DONE choose this value in such a way that you can observe an actual effect
  // for increasing problem sizes
  private final int REPS = 100000;

  private List<Integer> arrayList;

  private List<Integer> linkedList;

  @BeforeEach
  public void setUp() throws Exception {
    arrayList = new ArrayList<Integer>(SIZE);
    linkedList = new LinkedList<Integer>();
    for (var i = 0; i < SIZE; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }
  }

  @AfterEach
  public void tearDown() throws Exception {
    arrayList = null;
    linkedList = null;
  }

  @Test
  public void testLinkedListAddRemove() {
    long start = System.nanoTime();
    for (var r = 0; r < REPS; r++) {
      linkedList.add(0, 77);
      linkedList.remove(0);
    }
    long elapsedMs = (System.nanoTime() - start) / 1_000_000;
    System.out.println("SIZE=" + SIZE + " REPS=" + REPS + " testLinkedListAddRemove: " + elapsedMs + " ms");
  }

  @Test
  public void testArrayListAddRemove() {
    long start = System.nanoTime();
    for (var r = 0; r < REPS; r++) {
      arrayList.add(0, 77);
      arrayList.remove(0);
    }
    long elapsedMs = (System.nanoTime() - start) / 1_000_000;
    System.out.println("SIZE=" + SIZE + " REPS=" + REPS + " testArrayListAddRemove: " + elapsedMs + " ms");
  }

  @Test
  public void testLinkedListAccess() {
    long start = System.nanoTime();
    var sum = 0L;
    for (var r = 0; r < REPS; r++) {
      sum += linkedList.get(r % SIZE);
    }
    long elapsedMs = (System.nanoTime() - start) / 1_000_000;
    System.out.println("SIZE=" + SIZE + " REPS=" + REPS + " testLinkedListAccess: " + elapsedMs + " ms");
  }

  @Test
  public void testArrayListAccess() {
    long start = System.nanoTime();
    var sum = 0L;
    for (var r = 0; r < REPS; r++) {
      sum += arrayList.get(r % SIZE);
    }
    long elapsedMs = (System.nanoTime() - start) / 1_000_000;
    System.out.println("SIZE=" + SIZE + " REPS=" + REPS + " testArrayListAccess: " + elapsedMs + " ms");
  }
}