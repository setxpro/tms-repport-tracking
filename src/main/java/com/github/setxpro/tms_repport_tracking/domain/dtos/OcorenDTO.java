package com.github.setxpro.tms_repport_tracking.domain.dtos;

public record OcorenDTO(
        String codigoRastreio,
        String numeroNFe, // Número da Nota Fiscal Eletrônica
        String numeroCTe, // Número do CT-e Origem
        String serie, // Série do CT-e Origem ? Série da Nota Fiscal Eletrônica ?
        String data, //
        String hora,
        String cnpjTransportadora,
        String nomeRecebedor,
        String cnpjPagador,
        String codigo, // Código de Identificação da Ocorrência de Entrega
        String ocorrencia, // Atributo com as Informações Pertinentes a Ocorrência de Entrega
        String transportadora,
        String ufDestino,
        String cidadeDestino,
        String descricao // Descrição Resumida da Ocorrência de Entrega
) {
}
