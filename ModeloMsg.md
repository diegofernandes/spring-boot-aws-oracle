# Filas Operação GET #
## Fila de requeste ##
{
  branch:1,
  item:1,
  ...
}

## Objeto da fila de response ##
{
	"worker" : " ORACLE | REDIS | DYNAMODB "
  "wesquest": { // dados da fila de request

  },
  "data": [{ // 0 ou N
    branch:1,
    item:1,
  }],
	"error": { // Erro no acesso ao banco, erros de tabela, etc.
		"code":123,
		"message": 'Codigo 123'
  }
}
