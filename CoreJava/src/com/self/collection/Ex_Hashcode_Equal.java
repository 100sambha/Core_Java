package com.self.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Ex_Hashcode_Equal {
	public static void main(String[] args) {
		
		Map<HashEqualOverride, HashEqualOverride> map = new HashMap<HashEqualOverride, HashEqualOverride>();
		Set<HashEqualOverride> set = new HashSet<HashEqualOverride>();
		HashEqualOverride s1 = new HashEqualOverride(1, "Sambhaji");
		HashEqualOverride s2 = new HashEqualOverride(1, "Sambhaji");
		HashEqualOverride s3 = new HashEqualOverride(2, "Tushar");
		
		
		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);
		System.out.println(map.get(s2));
		System.out.println(map.size());
		
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set.size());
	}
}

class HashEqualOverride {
	private int id;
	private String name;
	
	public HashEqualOverride() {
		super();
	}

	public HashEqualOverride(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object o) {
		if(o==this) {
			return true;
		}
		if(!(o instanceof HashEqualOverride)) {
			return false;
		}
		HashEqualOverride equalOverride = (HashEqualOverride)o;
		return this.id== equalOverride.id && this.name.equals(equalOverride.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}
}