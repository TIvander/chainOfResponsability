# chainOfResponsability
Atividade Escolar Utilizando Padrão ChainOfResponsability
Foi criado um programa que simule um ambiente de atendimento ao público, onde um cliente liga para a empresa solicitando um tipo de atendimento, como os planos de celulares.
Os tipos de atendimentos são: Adesão de plano, Upgrade de plano, Downgrade de plano e Cancelamento de plano.
Assim como na vida real, quando queremos cancelar um plano, somos encaminhados para diversos atendentes até finalmente conseguir cancelar, então nete programa o cliente
será atendido pelo responsável de adesão, caso a solicitação do cliente não for adesão ele será encaminhado para o responsável de Upgrade. O responsável por Upgrade pode 
encaminhar para o responsável de Downgrade, e o responsável de Downgrade é o único que pode encaminhar para o responsável de Cancelamento.
Nos casos de testes Foram instanciados funcionários para cada um tipo de solicitação, e adicionado a sua lista de atendimentos os devidos atendimentos que eles podem realizar(no array foi inserido apenas 1 tipo de atendimento para exemplificar, porém cada atendente pode realizar mais de um atendimento, basta adicionar o tipo de atendimento desejado no array "atendimentoPorAtendente"). 
