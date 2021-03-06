while [[ "$$(curl --connect-timeout 2 -s -o /dev/null -w ''%{http_code}'' http://localhost:8180)" != "200" ]]; do 
  echo . 
  sleep 5
done 
echo "Keycloak is up"

docker-compose exec keycloak keycloak/bin/kcadm.sh config credentials --server http://localhost:8080/auth --realm master --user admin --password admin
docker-compose exec keycloak keycloak/bin/kcadm.sh update realms/master -s sslRequired=NONE --user admin --password admin
