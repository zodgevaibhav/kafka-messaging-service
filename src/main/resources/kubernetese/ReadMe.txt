1. Before applying kubernetese files create mound folder according to mentioned in yaml files
	 volumes:
      - hostPath:
          path:****
2. Kafka pod name must be written in etc hosts to resolve the adress
	27.0.0.1 kafka-5c4f7796bd-tfpdz
		where kafka-5c4f7796bd-tfpdz is kafka pod name