package kr.co.hanbit.viewpagerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kr.co.hanbit.viewpagerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val textList = listOf("뷰A", "뷰B", "뷰C", "뷰D") //뷰페이저에서 사용할 데이터를 가상으로 생성
        val customAdapter = CustomPagerAdapter() //커스텀어댑터 생성
        customAdapter.textList = textList //가상데이터를 어댑터에 전달
        binding.viewPager.adapter = customAdapter //뷰페이저에 어댑터 연결
        val tabTitles = listOf("View A", "View B", "View C", "View D") //메뉴명으로 사용할 이름들을 배열에 저장

        /* TabLayoutMediator를 사용해서 탭 레이아웃과 뷰페이저를 연결 */
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
}