# Chinese Entailment Graph Construction Algorithm

In this repository contains the source code for the construction algorithm for Chinese entailment graphs. This is an adaptation of [entGraph](https://github.com/mjhosseini/entGraph), with adaptations to handle Chinese inputs, and store global learning results by epoch.
For the root repository of the Chinese entailment graph project, check [here](https://github.com/Teddy-Li/ChineseEntGraph);
for our paper, check the following: [Cross-lingual Inference with A Chinese Entailment Graph]().

To run this code, do:
1. Follow step 1, 2, 3 in [entGraph](https://github.com/mjhosseini/entGraph);
2. Put your pipeline outputs from [EGZH Support Pipeline](https://github.com/Teddy-Li/EGZH-Support-Pipeline) under the present directory, this outputs file is by default `typed_triples_tacl.json`;
3. Follow step 5 and step 6 in [entGraph](https://github.com/mjhosseini/entGraph) for local and global learning respectively, set your options according to your need.

In our Chinese entailment graphs, we used `minArgPairForPred = 2`, `minPredForArgPair = 2`, `newMaxPredsTotal = 70000` (a new flag we added to limit the maximum number of predicates each typed sub-graph can host, this measure is introduced to reduce the risk of overcrowding our machines), `relAddress = typed_triples_tacl.json`, `simsFolder = typedEntGrDir_Chinese2_2_70000`; `featName = PGraph.FeatName.BINC`, `numIters = 5`, `edgeThreshold = 0.01`, `lmbda = 0.0001`. The results of this algorithm is stored in directories such as `typedEntGrDir_Chinese2_2_70000`, these can be evaluated with the entailment detection and boolean QA experiments in [entgraph_eval_chinese](https://github.com/Teddy-Li/entgraph_eval).

## Parsing English Sentences into Triples

In order to extract open relation triples from English sentences with the EasyCCG parser from this repository, 
first have your data ready in the following format:

```json
{"s": "Ephedrine is used in medicine.", "date": "", "articleId": 1, "lineId": 0}
```

Then run `sh prArgs.sh`, remember to swap the variables `fname`, `oName1` and `oName2` with your file paths. 🎉

## Cite Us

If you found this codebase useful, please cite:


Please also cite the [EntGraph](https://github.com/mjhosseini/entGraph) authors at:

    @article{javad2018learning,
      title={Learning typed entailment graphs with global soft constraints},
      author={Hosseini, Mohammad Javad and Chambers, Nathanael and Reddy, Siva and Holt, Xavier R and Cohen, Shay B and       Johnson,  Mark and Steedman, Mark},
      journal={Transactions of the Association for Computational Linguistics},
      volume={6},
      pages={703--717},
      year={2018},
      publisher={MIT Press}
    }