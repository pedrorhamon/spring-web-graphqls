package com.starking.graphql;

/**
 * @author pedroRhamon
 */
record Post(String id, String content) {

}

record Comment(String id, String content, String postId) {

}
