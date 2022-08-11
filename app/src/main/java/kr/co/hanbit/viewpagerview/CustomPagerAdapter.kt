package kr.co.hanbit.viewpagerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kr.co.hanbit.viewpagerview.databinding.ActivityMainBinding
import kr.co.hanbit.viewpagerview.databinding.ItemViewpagerBinding

class CustomPagerAdapter: RecyclerView.Adapter<Holder>() {
    var textList = listOf<String>() //어댑터에서 사용할 textList(MainAct에서 어댑터를 생성한 후 textList로 각각의 페이지에서 보여줄 텍스트 전달)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        //TODO("Not yet implemented")
        val binding = ItemViewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false) //바인딩 생성

        return Holder(binding) //Holder에 전달
    }

    /* Holder에 만들어둔 setText 메서드를 호출해서 화면에서 출력 */
    override fun onBindViewHolder(holder: Holder, position: Int) {
        //TODO("Not yet implemented")
        val text = textList[position]
        holder.setText(text)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return textList.size
    }
}

/* RecyclerView.ViewHolder를 상속받는 Holder 클래스 생성 */
class Holder(val binding: ItemViewpagerBinding): RecyclerView.ViewHolder(binding.root) {
    fun setText(text:String) {
        binding.textView.text = text
    }
}