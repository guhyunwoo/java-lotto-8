package lotto.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lottos implements Iterable<Lotto> {
    private final List<Lotto> lottos;

    private Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public static Lottos issue(int numberOfLottos) {
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < numberOfLottos; i++) {
            lottos.add(generateOneSortedLotto());
        }
        return new Lottos(lottos);
    }

    private static Lotto generateOneSortedLotto() {
        return new Lotto(RandomNumber.generateLottoNumbers()).sort();
    }

    @Override
    public Iterator<Lotto> iterator() {
        return lottos.iterator();
    }
}
