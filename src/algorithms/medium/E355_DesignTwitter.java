package algorithms.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/design-twitter/
 * 
 *         Design a simplified version of Twitter where users can post tweets,
 *         follow/unfollow another user and is able to see the 10 most recent
 *         tweets in the user's news feed. Your design should support the
 *         following methods:
 * 
 *         1. postTweet(userId, tweetId): Compose a new tweet.
 * 
 *         2. getNewsFeed(userId): Retrieve the 10 most recent tweet ids in the
 *         user's news feed. Each item in the news feed must be posted by users
 *         who the user followed or by the user herself. Tweets must be ordered
 *         from most recent to least recent.
 * 
 *         3. follow(followerId, followeeId): Follower follows a followee.
 * 
 *         4. unfollow(followerId, followeeId): Follower unfollows a followee.
 *
 */

public class E355_DesignTwitter {
	private int postCount;
	private Map<Integer, Integer> tweetCountMap;
	private Map<Integer, List<Integer>> tweetIdMap;
	private Map<Integer, Integer> tweetOwnerMap;
	private Map<Integer, Set<Integer>> followeeMap;

	/** Initialize your data structure here. */
	public E355_DesignTwitter() {
		tweetCountMap = new HashMap<Integer, Integer>();
		tweetIdMap = new HashMap<Integer, List<Integer>>();
		tweetOwnerMap = new HashMap<Integer, Integer>();
		followeeMap = new HashMap<Integer, Set<Integer>>();
	}

	/** Compose a new tweet. */
	public void postTweet(int userId, int tweetId) {
		tweetCountMap.put(tweetId, ++postCount);
		tweetOwnerMap.put(tweetId, userId);
		getTweetIdList(userId).add(tweetId);
	}

	/**
	 * Retrieve the 10 most recent tweet ids in the user's news feed. Each item
	 * in the news feed must be posted by users who the user followed or by the
	 * user herself. Tweets must be ordered from most recent to least recent.
	 */
	public List<Integer> getNewsFeed(int userId) {
		List<Integer> result = new ArrayList<Integer>();
		Set<Integer> followeeSet = getFolloweeSet(userId);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return tweetCountMap.get(b) - tweetCountMap.get(a);
			}
		});
		Map<Integer, Integer> idxMap = new HashMap<Integer, Integer>();
		for (Integer followeeId : followeeSet) {
			List<Integer> tweetIdList = getTweetIdList(followeeId);
			int idx = tweetIdList.size() - 1;
			if (idx >= 0) {
				idxMap.put(followeeId, idx - 1);
				pq.add(tweetIdList.get(idx));
			}
		}
		while (result.size() < 10 && !pq.isEmpty()) {
			Integer topTweetId = pq.poll();
			result.add(topTweetId);
			Integer ownerId = tweetOwnerMap.get(topTweetId);
			int idx = idxMap.get(ownerId);
			if (idx >= 0) {
				List<Integer> tweetIdList = getTweetIdList(ownerId);
				pq.add(tweetIdList.get(idx));
				idxMap.put(ownerId, idx - 1);
			}
		}
		return result;
	}

	/**
	 * Follower follows a followee. If the operation is invalid, it should be a
	 * no-op.
	 */
	public void follow(int followerId, int followeeId) {
		getFolloweeSet(followerId).add(followeeId);
	}

	/**
	 * Follower unfollows a followee. If the operation is invalid, it should be
	 * a no-op.
	 */
	public void unfollow(int followerId, int followeeId) {
		if (followerId != followeeId) {
			getFolloweeSet(followerId).remove(followeeId);
		}
	}

	private Set<Integer> getFolloweeSet(int userId) {
		Set<Integer> followeeSet = followeeMap.get(userId);
		if (followeeSet == null) {
			followeeSet = new HashSet<Integer>();
			followeeSet.add(userId);
			followeeMap.put(userId, followeeSet);
		}
		return followeeSet;
	}

	private List<Integer> getTweetIdList(int userId) {
		List<Integer> tweetIdList = tweetIdMap.get(userId);
		if (tweetIdList == null) {
			tweetIdList = new ArrayList<Integer>();
			tweetIdMap.put(userId, tweetIdList);
		}
		return tweetIdList;
	}

	public static void main(String[] args) {
		E355_DesignTwitter obj = new E355_DesignTwitter();
		obj.postTweet(1, 1);
		List<Integer> param_2 = obj.getNewsFeed(1);
		obj.follow(1, 1);
		obj.unfollow(1, 1);
		System.out.println(param_2);
	}

}
