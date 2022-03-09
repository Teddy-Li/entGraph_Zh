# Chinese Entailment Graph Construction Algorithm

In this folder contains the source code for the construction algorithm for Chinese entailment graphs. This is an adaptation of [entGraph](https://github.com/mjhosseini/entGraph), with adaptations to handle Chinese inputs, and store global learning results by epoch.

To run this code, do:
1. Follow step 1, 2, 3 in [entGraph](https://github.com/mjhosseini/entGraph);
2. Put your pipeline outputs from [NE_Pipeline](../NE_Pipeline) under the present directory, this outputs file is by default `typed_triples_tacl.json`;
3. Follow step 5 and step 6 in [entGraph](https://github.com/mjhosseini/entGraph) for local and global learning respectively, set your options according to your need.

In our Chinese entailment graphs, we used `minArgPairForPred = 2`, `minPredForArgPair = 2`, `newMaxPredsTotal = 70000` (a new flag we added to limit the maximum number of predicates each typed sub-graph can host, this measure is introduced to reduce the risk of overcrowding our machines), `relAddress = typed_triples_tacl.json`, `simsFolder = typedEntGrDir_Chinese2_2_70000`; `featName = PGraph.FeatName.BINC`, `numIters = 5`, `edgeThreshold = 0.01`, `lmbda = 0.0001`. The results of this algorithm is stored in directories such as `typedEntGrDir_Chinese2_2_70000`, these can be evaluated with the entailment detection and boolean QA experiments in [entgraph_eval_chinese](../entgraph_eval_chinese).

## Parsing English Sentences into Triples

In order to extract open relation triples from English sentences with the EasyCCG parser from this repository, 
first have your data ready in the following format:

```json
{"s": "Ephedrine is used in medicine.", "date": "", "articleId": 1, "lineId": 0}
```

Then run `sh prArgs.sh`, remember to swap the variables `fname`, `oName1` and `oName2` with your file paths. 🎉