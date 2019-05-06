#!/usr/bin/env bash
sleep 20;
docker exec -i mysql mysql -uroot -proot <<<"create database biarca;"
