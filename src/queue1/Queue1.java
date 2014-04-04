package queue1;

/**
 * Eine einfache Queue (Schlange) von Objekten. 
 * Eine Queue funktioniert nach der 
 * FIFO-Methode - first in first out.
 * 
 * @author Johann Weiser
 * @version 2014-03-14
 */
public class Queue1 {
	/** Die Schlange der Ojkte. */
	Object[] oq;
	/** Der n�chste freie Platz in der Schlange. */
	int nextFree;
	/** Zeiger auf das Objekt, welches als n�chstes dran kommt. */
	int nextFull;
	
	/**
	 * Eine neue Schlange wird erzeugt.
	 * @param size Die maximale Gr��e der Schlange.
	 */
	public Queue1(int size) {
		oq = new Object[size];
		nextFree = 0;
		nextFull = 0;
	}
	
	/**
	 * F�gt ein Objekt zur Schlange hinzu.
	 * @param o Das Objekt, welches hinzugef�gt wird.
	 */
	public void add(Object o) {
		if (oq[nextFree] != null) {
			throw new RuntimeException("Queue is full!");
		}
		oq[nextFree++] = o;
		if (nextFree == oq.length) {
			nextFree = 0;
		}
	}
	
	/**
	 * Holt ein Objekt von der Schlange - ein Objekt "kommt dran".
	 * @return Das Objekt, welches aus der Schlange genommen wird.
	 */
	public Object get() {
		if (oq[nextFull] == null) {
			throw new RuntimeException("Queue is empty!");
		}
		Object o = oq[nextFull];
		oq[nextFull++] = null;
		if (nextFull == oq.length) {
			nextFull = 0;
		}
		return o;
	}
	
	
	/**
	 * Pr�ft, ob die Schlange voll ist. 
	 * @return True wenn voll, sonst false.
	 */
	public boolean isFull() {
		return oq[nextFree] != null;
	}

	/**
	 * Pr�ft, ob die Schlange leer ist.
	 * @return True wenn leer, sonst false.
	 */
	public boolean isEmpty() {
		return oq[nextFull] == null;
	}

}
