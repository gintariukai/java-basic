package geekbrains.lesson_1.hello_world.task1.transportas.masinos;

import lt.codeacademy.interfeisai.task1.interfeses.IsipiltiKuro;
import geekbrains.lesson_1.hello_world.task1.transportas.TransportoPriemone;

public abstract class AbstraktiMasina extends TransportoPriemone implements IsipiltiKuro {
	private int kuroLikutis = 0;

	@Override
	public void ipilti(int litrai) {
		this.kuroLikutis += litrai;
	}
}
