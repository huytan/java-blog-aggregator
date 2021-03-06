// CHECKSTYLE:OFF
/**
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */

package cz.tannth.jba.entity.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cz.tannth.jba.entity.Blog;
import cz.tannth.jba.entity.Item;
import cz.tannth.jba.entity.Role;
import cz.tannth.jba.entity.User;

public class RoleBuilder extends RoleBuilderBase<RoleBuilder> {
	public static RoleBuilder role() {
		return new RoleBuilder();
	}

	public RoleBuilder() {
		super(new Role());
	}

	public Role build() {
		return getInstance();
	}
}

class RoleBuilderBase<GeneratorT extends RoleBuilderBase<GeneratorT>> {
	private Role instance;

	protected RoleBuilderBase(Role aInstance) {
		instance = aInstance;
	}

	protected Role getInstance() {
		return instance;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withUsers(List<User> aValue) {
		instance.setUsers(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withAddedUser(User aValue) {
		if (instance.getUsers() == null) {
			instance.setUsers(new ArrayList<User>());
		}

		((ArrayList<User>) instance.getUsers()).add(aValue);

		return (GeneratorT) this;
	}

	public AddedUserUserBuilder withAddedUser() {
		User obj = new User();

		withAddedUser(obj);

		return new AddedUserUserBuilder(obj);
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withId(Integer aValue) {
		instance.setId(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withName(String aValue) {
		instance.setName(aValue);

		return (GeneratorT) this;
	}

	public class AddedUserUserBuilder extends UserBuilderBase<AddedUserUserBuilder> {
		public AddedUserUserBuilder(User aInstance) {
			super(aInstance);
		}

		@SuppressWarnings("unchecked")
		public GeneratorT endUser() {
			return (GeneratorT) RoleBuilderBase.this;
		}
	}

	public static class UserBuilderBase<GeneratorT extends UserBuilderBase<GeneratorT>> {
		private User instance;

		protected UserBuilderBase(User aInstance) {
			instance = aInstance;
		}

		protected User getInstance() {
			return instance;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withRoles(List<Role> aValue) {
			instance.setRoles(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withAddedRole(Role aValue) {
			if (instance.getRoles() == null) {
				instance.setRoles(new ArrayList<Role>());
			}

			((ArrayList<Role>) instance.getRoles()).add(aValue);

			return (GeneratorT) this;
		}

		public AddedRoleRoleBuilder withAddedRole() {
			Role obj = new Role();

			withAddedRole(obj);

			return new AddedRoleRoleBuilder(obj);
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withId(Integer aValue) {
			instance.setId(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withName(String aValue) {
			instance.setName(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withEmail(String aValue) {
			instance.setEmail(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withPassword(String aValue) {
			instance.setPassword(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withBlogs(List<Blog> aValue) {
			instance.setBlogs(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withAddedBlog(Blog aValue) {
			if (instance.getBlogs() == null) {
				instance.setBlogs(new ArrayList<Blog>());
			}

			((ArrayList<Blog>) instance.getBlogs()).add(aValue);

			return (GeneratorT) this;
		}

		public AddedBlogBlogBuilder withAddedBlog() {
			Blog obj = new Blog();

			withAddedBlog(obj);

			return new AddedBlogBlogBuilder(obj);
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withEnabled(boolean aValue) {
			instance.setEnabled(aValue);

			return (GeneratorT) this;
		}

		public class AddedRoleRoleBuilder extends RoleBuilderBase<AddedRoleRoleBuilder> {
			public AddedRoleRoleBuilder(Role aInstance) {
				super(aInstance);
			}

			@SuppressWarnings("unchecked")
			public GeneratorT endRole() {
				return (GeneratorT) UserBuilderBase.this;
			}
		}

		public class AddedBlogBlogBuilder extends BlogBuilderBase<AddedBlogBlogBuilder> {
			public AddedBlogBlogBuilder(Blog aInstance) {
				super(aInstance);
			}

			@SuppressWarnings("unchecked")
			public GeneratorT endBlog() {
				return (GeneratorT) UserBuilderBase.this;
			}
		}
	}

	public static class BlogBuilderBase<GeneratorT extends BlogBuilderBase<GeneratorT>> {
		private Blog instance;

		protected BlogBuilderBase(Blog aInstance) {
			instance = aInstance;
		}

		protected Blog getInstance() {
			return instance;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withItems(List<Item> aValue) {
			instance.setItems(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withAddedItem(Item aValue) {
			if (instance.getItems() == null) {
				instance.setItems(new ArrayList<Item>());
			}

			((ArrayList<Item>) instance.getItems()).add(aValue);

			return (GeneratorT) this;
		}

		public AddedItemItemBuilder withAddedItem() {
			Item obj = new Item();

			withAddedItem(obj);

			return new AddedItemItemBuilder(obj);
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withUser(User aValue) {
			instance.setUser(aValue);

			return (GeneratorT) this;
		}

		public UserUserBuilder withUser() {
			User obj = new User();

			withUser(obj);

			return new UserUserBuilder(obj);
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withId(Integer aValue) {
			instance.setId(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withName(String aValue) {
			instance.setName(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withUrl(String aValue) {
			instance.setUrl(aValue);

			return (GeneratorT) this;
		}

		public class AddedItemItemBuilder extends ItemBuilderBase<AddedItemItemBuilder> {
			public AddedItemItemBuilder(Item aInstance) {
				super(aInstance);
			}

			@SuppressWarnings("unchecked")
			public GeneratorT endItem() {
				return (GeneratorT) BlogBuilderBase.this;
			}
		}

		public class UserUserBuilder extends UserBuilderBase<UserUserBuilder> {
			public UserUserBuilder(User aInstance) {
				super(aInstance);
			}

			@SuppressWarnings("unchecked")
			public GeneratorT endUser() {
				return (GeneratorT) BlogBuilderBase.this;
			}
		}
	}

	public static class ItemBuilderBase<GeneratorT extends ItemBuilderBase<GeneratorT>> {
		private Item instance;

		protected ItemBuilderBase(Item aInstance) {
			instance = aInstance;
		}

		protected Item getInstance() {
			return instance;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withBlog(Blog aValue) {
			instance.setBlog(aValue);

			return (GeneratorT) this;
		}

		public BlogBlogBuilder withBlog() {
			Blog obj = new Blog();

			withBlog(obj);

			return new BlogBlogBuilder(obj);
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withId(Integer aValue) {
			instance.setId(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withTitle(String aValue) {
			instance.setTitle(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withDescription(String aValue) {
			instance.setDescription(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withPublishedDate(Date aValue) {
			instance.setPublishedDate(aValue);

			return (GeneratorT) this;
		}

		@SuppressWarnings("unchecked")
		public GeneratorT withLink(String aValue) {
			instance.setLink(aValue);

			return (GeneratorT) this;
		}

		public class BlogBlogBuilder extends BlogBuilderBase<BlogBlogBuilder> {
			public BlogBlogBuilder(Blog aInstance) {
				super(aInstance);
			}

			@SuppressWarnings("unchecked")
			public GeneratorT endBlog() {
				return (GeneratorT) ItemBuilderBase.this;
			}
		}
	}
}
