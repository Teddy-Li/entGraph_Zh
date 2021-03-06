package constants;

import entailment.vector.EntailGraphFactoryAggregator;

public class ConstantsAgg {

	// ####################################################################################################
	// Extract sims
	// All parameters:

	public static boolean onlyDSPreds = false;
	public static boolean rawExtractions = false;// gbooks original (or gbooks in general?)
	public static boolean GBooksCCG = false;
	public static boolean useTimeEx = false;
	public static boolean isCCG = true;
	public static boolean isTyped = true;
	public static boolean updatedTyping = false;// a few fixes here and there. flase for TACL experiments!
	public static boolean figerHierarchy = false;// for TACL experiments, we had it false
	public static boolean isForeign = true;
	public static boolean addTimeStampToFeats = false;
	public static final boolean normalizePredicate = true;// if rawExtraction, wouldn't matter.
	public static final boolean keepWillTense = false;// Must be false for normal entailment graphs
	public static final boolean backupToStanNER = false;//false for TACL experiments
	public static final boolean onlyBinc = false;//vs all similarity measures. use to save memory and storage! False for TACL
	
	public static boolean removeEventEventModifiers = false;//false for TACL exp
	public static boolean removeStopPreds = false;//false for TACL exp
	public static boolean removePronouns = false;//TODO: You must move this to parsing 
	public static boolean cutoffBasedonNSGraphs = false;// use NSpike-based cutoffs. false for TACL exp
	
	

	// cutoffs
	public static int minArgPairForPred = 2;// 100;
	public static int minPredForArgPair = 2;// 20;// min num of unique predicates for argpair
	public static int newMaxPredsTotal = 70000;
	// when NS based num aps, we allow x aps for each pred, even if not in NS
	public static int numArgPairsNSBasedAlwaysAllowed = 0;// default: 10
	public static int numTopTypePairs = 20;// the big types, used in NSbased sizes (if it's one)
	public static int maxPredsTotal = -1;// 35000;

	public static final int minPredForArg = -1;// min num of unique predicates for
	public static boolean removeGGFromTopPairs = false;// whether we should remove triples with two general entities
														// from top pairs, false for TACL exp

	public static final int numThreads = 20;

	// embedding parameters
	public static boolean embBasedScores = false;// use sigmoid(transE score) instead of counts
	public static double sigmoidLocParameter = 10;
	public static double sigmoidScaleParameter = .25;
	public static int dsPredNumThreads = 15;
	public static EntailGraphFactoryAggregator.ProbModel probModel = EntailGraphFactoryAggregator.ProbModel.PEL;
	public static EntailGraphFactoryAggregator.LinkPredModel linkPredModel = EntailGraphFactoryAggregator.LinkPredModel.ConvE;

	// public static String relAddress = "news_gen12.json";
	// public static String relAddress = "news_genC.json";
	public static String relAddress = "typed_triples_tacl.json";
	public static String NERAddress = "data/stan_NER/news_genC_stanNER.json";//not important if no backupto stan

//	public static String simsFolder = "typedEntGrDir_aida_gen12_UT_hier_back" + minArgPairForPred + "_"
//			+ minPredForArgPair;

	// public static String simsFolder = "typedEntGrDirC_NSBased_f20_thing60_60_" +
	// minArgPairForPred + "_"
	// + minPredForArgPair + "_test";
//	public static String simsFolder = "typedEntGrDirC_NSBased_" + minArgPairForPred + "_" + minPredForArgPair
//			+ "thing_80_location_thing_times4_f20_GG_UT_back_noGGThing_week";
//	public static String simsFolder = "typedEntGrDirC_NSBased_" + minArgPairForPred + "_" + minPredForArgPair
//			+ "f20_GG_noGGThing_week";
//	public static String simsFolder = "typedEntGrDirC_CN_NBEE_NSBased_" + minArgPairForPred + "_" + minPredForArgPair
//			+ "_thth_thloc_time6_f20_GG_noGGThing";
	public static String simsFolder = "typedEntGrDir_Chinese" + minArgPairForPred + "_" + minPredForArgPair + "_" + newMaxPredsTotal;
//	public static String simsFolder = "typedEntGrDirC" + minArgPairForPred + "_" + minPredForArgPair
//			+ "f20_GG_noGGThing_week";

	public static String foreinTypesAddress = "data/chinese_types.txt";// only important if isForeign=True

	// public static String simsFolder = "typedEntGrDir_datestamp_" +
	// minArgPairForPred + "_" + minPredForArgPair;

	public static boolean computeProbELSims = false;
	public static boolean linkPredBasedRandWalk = false;
	
	public static String NSSizesAddress;
	public static String NSPredSizesAddress;
	
	static {
		
		if (ConstantsAgg.addTimeStampToFeats) {
			NSSizesAddress = "data/NS_sizes_week_3_3.txt";
			NSPredSizesAddress = "data/NS_pred_sizes_week_3_3.txt";
		}
		else if (ConstantsAgg.figerHierarchy) {
			NSSizesAddress = "data/NS_sizes_hier_3_2.txt";
			NSPredSizesAddress = "data/NS_pred_sizes_hier_3_2.txt";
		}
		else {
			NSSizesAddress = "data/NS_sizes.txt";
			NSPredSizesAddress = "data/NS_pred_sizes.txt";
		}
	}
}
