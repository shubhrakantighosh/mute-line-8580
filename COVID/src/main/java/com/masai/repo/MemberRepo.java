package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.model.Member;
public interface MemberRepo extends JpaRepository<Member,Integer>{
//
//	@Query("select m from Member m inner join m.idCard ic where ic.adharCard=?1 ")
//	public Member getMemberByAdhar(String adharNo);
//	
//	@Query("select m from Member m inner join m.idcard ic where ic.panNo=?1 ")
//	public Member getMemberByPanNo(String panNo);
	
	@Query("select m from Member m where adharCard=?1 ")
	public Member getMemberByAdhar(String adharNo);
	
	@Query("select m from Member m where panNo=?1 ")
	public Member getMemberByPanNo(String panNo);
	
	
}
