package com.springproject.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.springproject.vo.CommunityVO;
import com.springproject.vo.LikeVO;

@Mapper
public interface CommunityMapper {
   
      //글 생성
      int insertCommunity(CommunityVO communityInsert);
      
      // 게시물 출력
      List<CommunityVO> getCommunityList(Map<String,Object> map);
      
      //상세페이지 조회
      CommunityVO getCommunityDetail(CommunityVO cvo);
      
      //글 삭제
      void deleteCommunitySeq(CommunityVO cvo);
      // 댓글도 삭제
      void deleteCommunityCommentList(CommunityVO cvo);
      
      //글 수정
      void updateCommunity(CommunityVO cvo);
      
      // 조회수
      void hitIncrease(CommunityVO hitNotice);
      
      int selectCommunityCount(CommunityVO paging);

      int getCommunityNo();
      
      int likeHit(LikeVO like);
      
      void insertLike(LikeVO like);
      
      void deleteLike(LikeVO like);
      
      LikeVO getLikeList(LikeVO like);
      
      List<CommunityVO> memberCommunityBoardList(Map<String,Object> map);
}