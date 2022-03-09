#!/bin/bash
fName=levyholt_backtranslation_input_dev.json
oName1=levyholt_dev_predArgs_gen.txt
oName2=levyholt_dev_predArgs_NE.txt
echo "0" > offset.txt
i=0
echo $i
while [ -f offset.txt ]; do
if [ $i -eq 0 ]
then
        java -cp lib/*:bin  entailment.LinesHandler $fName $i $oName1 $oName2 1>tmpo.txt 2>lineNumbers_b.txt
else
        java -cp lib/*:bin  entailment.LinesHandler $fName $i $oName1 $oName2 1>>tmpo.txt 2>>lineNumbers_b.txt
fi
i=$((i + 1))
echo $i
done
