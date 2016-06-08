#!/bin/bash
datum=$(date "+%Y-%m-%d")
wget -O /home/jmurin/kurzy/today/today_bet_offer$datum.pdf http://www.ifortuna.sk/pdf/sk/today_bet_offer.pdf
vcera=$(date -d "yesterday 13:00 " '+%Y-%m-%d')
wget -O /home/jmurin/kurzy/vysledky/vysledky$vcera.txt http://www.ifortuna.sk/sk/stavkovanie/vysledky/index\$508780.html?result_date=$vcera
