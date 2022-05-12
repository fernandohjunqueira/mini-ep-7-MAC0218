package domain

import domain.criterios.*

class AnalisadorDeAprovacao {
    private var criterio: CriterioDeAprovacao = Basico()

    fun defineCriterio(novoCriterio: CriterioDeAprovacao) {
        criterio = novoCriterio
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado {
        return BoletimFechado(
            boletim.mediaEPs,
            boletim.mediaMiniEPs,
            criterio.mediaFinal(boletim),
            criterio.estaAprovado(boletim))
    }
}