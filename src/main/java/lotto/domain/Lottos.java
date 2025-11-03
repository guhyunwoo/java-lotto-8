package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private final List<Lotto> lottos;

    private Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public static Lottos issue(int numberOfLottos) {
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < numberOfLottos; i++) {
            lottos.add(generateOneLotto());
        }
        return new Lottos(lottos);
    }

    private static Lotto generateOneLotto() {
        return new Lotto(RandomNumber.generateLottoNumbers());
    }
}
