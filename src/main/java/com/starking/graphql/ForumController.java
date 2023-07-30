package com.starking.graphql;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/**
 * @author pedroRhamon
 */
@Controller
public class ForumController {

	@Autowired
	ForumService service;

	@Autowired
	CommentService commentService;

	//@SchemaMapping(typeName = "Query", value = "postById")
	@QueryMapping
	public Post postById(@Argument String id) {
		return this.service.postById(id);
	}

	@MutationMapping
	public Collection<Post> createPost(@Argument String content) {
		return this.service.createPost(content);
	}

	@MutationMapping
	public Collection<Comment> createComment(@Argument String content, @Argument String postId) {
		return this.commentService.createComment(content, postId);
	}
}
